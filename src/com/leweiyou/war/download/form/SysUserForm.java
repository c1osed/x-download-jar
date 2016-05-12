package com.leweiyou.war.download.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class SysUserForm {
	
	@NotEmpty(message = "{name.is.empty}")
	@Length(min = 2,message="{name.is.too.short}")
	private String username;
	
	@NotEmpty(message = "密码不能为空")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
