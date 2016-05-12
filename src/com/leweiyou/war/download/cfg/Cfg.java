package com.leweiyou.war.download.cfg;

import com.leweiyou.tools.cfg.CfgData;
import com.leweiyou.tools.cfg.CfgUtil;

/**
 * 定义的配置文件，首先会去tomcat，jboss的根目录下的appcfg下去查找，如果查找不到，则使用项目classpath下的配置文件
 * @author ZhangWeican
 *
 */
public class Cfg {
	public static CfgData cfg = CfgUtil.getCfg("config.properties");

}