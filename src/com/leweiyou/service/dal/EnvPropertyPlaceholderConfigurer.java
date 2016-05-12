package com.leweiyou.service.dal;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.leweiyou.tools.cfg.EnvUtil;



public class EnvPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    public void init() {
        
        String path = EnvUtil.getEnvFilePath();
        Properties p = new Properties();
        try {
			p.load(new FileInputStream(new File(path)));
		} catch (Exception e) {
			logger.error("Load env config error.", e);
		}
        //关键方法,调用的PropertyPlaceholderConfigurer中的方法,通过这个方法将自定义加载的properties文件加入spring中
    	this.setProperties(p); 
    }

}

