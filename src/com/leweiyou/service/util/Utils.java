package com.leweiyou.service.util;

import org.springframework.web.servlet.support.RequestContext;

/**
 * 工具类了
 * @author Zhangweican
 *
 */
public class Utils {
	
	/**
	 * 定义I18N对应的资源文件的Key  获取Value值
	 * @param key
	 * @return
	 */
	public static String i18n(String key){
		RequestContext requestContext = new RequestContext(CXT.getRequest());
		return requestContext.getMessage(key);
	}
	/**
	 * 定义I18N对应的资源文件的Key  获取Value值，可以实现EL表达式传值
	 * @param key
	 * @return
	 */
	public static String i18n(String key,String... params){
		RequestContext requestContext = new RequestContext(CXT.getRequest());
		if(params == null || params.length == 0 ){
			return requestContext.getMessage(key);
		}
		return requestContext.getMessage(key, params);
	}
}
