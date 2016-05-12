package com.leweiyou.mapper.download.mybatis.entry;

import java.util.Date;

public class TUserLogin {
    /**<br/>
     * 字段: t_user_login.id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * 说明: ID逐渐
     */
    private Long id;

    /**<br/>
     * 字段: t_user_login.username<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * 说明: 用户名
     */
    private String username;

    /**<br/>
     * 字段: t_user_login.password<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * 说明: 密码
     */
    private String password;

    /**<br/>
     * 字段: t_user_login.login_date<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * 说明: 登录时间
     */
    private Date loginDate;

    /**
     * @return t_user_login.id: ID逐渐
     */
    public Long getId() {
        return id;
    }

    /**<br/>
     * 字段: t_user_login.id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * @param id: ID逐渐
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return t_user_login.username: 用户名
     */
    public String getUsername() {
        return username;
    }

    /**<br/>
     * 字段: t_user_login.username<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * @param username: 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return t_user_login.password: 密码
     */
    public String getPassword() {
        return password;
    }

    /**<br/>
     * 字段: t_user_login.password<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * @param password: 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return t_user_login.login_date: 登录时间
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**<br/>
     * 字段: t_user_login.login_date<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * @param loginDate: 登录时间
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}