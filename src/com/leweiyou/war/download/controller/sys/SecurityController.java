package com.leweiyou.war.download.controller.sys;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leweiyou.service.valid.Valid;
import com.leweiyou.war.download.controller.BaseController;
import com.leweiyou.war.download.form.SysUserForm;

@Controller
@RequestMapping("/security")
public class SecurityController extends BaseController{

	
	/**
	 * 用户登出
	 */
	@RequestMapping("/logout")
	public String logout(){
		SecurityUtils.getSubject().logout();
		return index();
	}
	
	
	/**
	 * 跳转到工程主页，就是登录页
	 */
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	}
	
	/**
	 * 无权限页面
	 */
	@RequestMapping("/unauthorized")
	public String unauthorized(){
		
		return "/common/403";
	}
	
	protected void loginValid(SysUserForm form){
		if(StringUtils.isEmpty(form.getUsername())){
			addValidError("name.is.empty");
		}
		if(StringUtils.isEmpty(form.getPassword())){
			addValidError("password.is.empty");
		}
		if(form.getUsername().length() > 5){
			addValidError("username", "username.too.long",new String[]{"5"});
		}
	}
}
