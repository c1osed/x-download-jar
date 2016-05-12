package com.leweiyou.service.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义校验的标志
 * @author Zhangweican
 *
 */
@Target(ElementType.METHOD) 
@Retention(RetentionPolicy.RUNTIME) 
public @interface Valid {
	/**
	 * 定义视图的名称
	 * @return
	 */
	String errorView() default "";
	
	/**
	 * 定义校验的方法,该方法定义有几个要点<br>
	 * 1.方法返回值没有要求，方法的访问权限没有要求（public，private均可）<br>
	 * 2.再方法内部，调用父类的AddValidError 方法，支持传入参数，到I18N资源文件
	 * 
	 * 如果不定义，默认是该注释定义方法 + Valid 如loginValid
	 * @return
	 */
	String validFunction() default "";
	
	/**
	 * 定义校验参数所在的标号，默认是0，<br>
	 * 暂时没有实现对多个字段校验的情况
	 */
	int parameterPosition() default 0;
}
