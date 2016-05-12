package com.leweiyou.mapper.download.mybatis.entry;

import java.util.Date;

public class TUserCopy extends TUserCopyKey {
    /**<br/>
     * 字段: t_user_copy.username<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * 说明: 用户名
     */
    private String username;

    /**<br/>
     * 字段: t_user_copy.password<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * 说明: 密码
     */
    private String password;

    /**<br/>
     * 字段: t_user_copy.login_date<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * 说明: 登录时间
     */
    private Date loginDate;

    /**<br/>
     * 字段: t_user_copy.big<br/>
     * 可空: true<br/>
     * 缺省: <br/>
     * 长度: 65535<br/>
     * 说明: 大字段
     */
    private byte[] big;

    /**
     * @return t_user_copy.username: 用户名
     */
    public String getUsername() {
        return username;
    }

    /**<br/>
     * 字段: t_user_copy.username<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * @param username: 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return t_user_copy.password: 密码
     */
    public String getPassword() {
        return password;
    }

    /**<br/>
     * 字段: t_user_copy.password<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 512<br/>
     * @param password: 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return t_user_copy.login_date: 登录时间
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**<br/>
     * 字段: t_user_copy.login_date<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * @param loginDate: 登录时间
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * @return t_user_copy.big: 大字段
     */
    public byte[] getBig() {
        return big;
    }

    /**<br/>
     * 字段: t_user_copy.big<br/>
     * 可空: true<br/>
     * 缺省: <br/>
     * 长度: 65535<br/>
     * @param big: 大字段
     */
    public void setBig(byte[] big) {
        this.big = big;
    }
}