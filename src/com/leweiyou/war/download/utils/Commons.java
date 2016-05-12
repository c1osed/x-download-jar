package com.leweiyou.war.download.utils;

public class Commons {
	/**
	 * 定义jsp存放位置，和 springmvc 的 InternalResourceViewResolver 配置保持一致
	 */
	public static final String Path_JSP = "/jsp";

	/**
	 * 对一些需要访问jsp的情况，因为直接访问jsp在spring处理时候，不会注入I18N资源文件，所以对jsp的访问，所使用的后缀变成jspp
	 */
	public static final String JSPP = ".jspp";
	
	
}