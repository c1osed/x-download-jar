package com.leweiyou.service.valid;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.leweiyou.service.entity.ValidErrorEntity;
import com.leweiyou.service.util.CXT;

/**
 * 定义AOP支持前台页面的校验，通过反射加载对应的校验方法。
 * @author Zhangweican
 *
 */
@Controller
@Aspect
public class ValidAspect {
	private static final String ValidPrix = "Valid";
	@Autowired 
	private Validator validator;
	
	@Around("@annotation(com.leweiyou.service.valid.Valid)")
	public Object doValid(ProceedingJoinPoint pjp) throws Throwable{
		MethodSignature signature = (MethodSignature) pjp.getSignature();
		Method method = signature.getMethod();
		Object[] args = pjp.getArgs();

		Valid valid = method.getAnnotation(Valid.class);
		boolean isJs = method.isAnnotationPresent(ResponseBody.class);
		String validFunction = valid.validFunction();
		String errorView = valid.errorView();
		int parmPosion = valid.parameterPosition();
		
		if(StringUtils.isEmpty(validFunction)){
			validFunction = ValidPrix + method.getName();
			
		}
		
		if(StringUtils.isEmpty(errorView)){
			errorView = method.getAnnotation(RequestMapping.class).value()[0];
		}
		
		//调用spring的Validation，进行字段的校验
		Object target = pjp.getTarget();
		Object obj = args[parmPosion > args.length - 1 ? 0 : parmPosion];
		BeanPropertyBindingResult br = new BeanPropertyBindingResult(obj,obj.getClass().getName());
		validator.validate(obj, br);
		ValidErrorEntity map = CXT.getValidErrorMap();
		
		if(br.hasErrors()){
			for(FieldError error : br.getFieldErrors()){
				map.addValidError(error.getField(), error.getDefaultMessage());
			}
			return setReturn(method,isJs,map,errorView);
		}
		
		//扩展校验，反射进校验方法，继续校验
		for(Method m : target.getClass().getDeclaredMethods()){
			if(validFunction.equals(m.getName())){
				Object[] targetArgs = (args != null && args.length > 0) ? args : null;
				if(args != null && args.length > m.getParameterTypes().length){
					targetArgs = Arrays.copyOfRange(args, 0, m.getParameterTypes().length);
				}
				m.setAccessible(true);
				m.invoke(target, targetArgs);
			}
		}
		
		if(map.isHaveError()){
			return setReturn(method,isJs,map,errorView);
		}
		return pjp.proceed();
	}

	/**
	 * 根据结果做出不同的返回
	 * @param method
	 * @param isJs
	 * @param map
	 * @param errorView
	 * @return
	 */
	private Object setReturn(Method method,boolean isJs,ValidErrorEntity map,String errorView){
		Class returnClass = method.getReturnType();
		if(isJs || returnClass == null){
			boolean isError = false;
			String json = "";
			if(map.isHaveError()){
				isError = true;
			}
			json += "," + JSONArray.toJSONString(map.all());
			return "{isError:" + isError + json + "}";
		}else{
			Object o = new Object();
			try {
				o = returnClass.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(o instanceof String){
				return new String(errorView);
			}else if(o instanceof ModelAndView){
				return new ModelAndView(errorView);
			}else{
				return new String("/common/error");
			}
		}
	}
}
