package com.leweiyou.mapper.download.mybatis.entry;

public class TUserCopyKey {
    /**<br/>
     * 字段: t_user_copy.id2<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * 说明: ID逐渐
     */
    private Long id2;

    /**<br/>
     * 字段: t_user_copy.id1<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * 说明: ID
     */
    private Long id1;

    /**
     * @return t_user_copy.id2: ID逐渐
     */
    public Long getId2() {
        return id2;
    }

    /**<br/>
     * 字段: t_user_copy.id2<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * @param id2: ID逐渐
     */
    public void setId2(Long id2) {
        this.id2 = id2;
    }

    /**
     * @return t_user_copy.id1: ID
     */
    public Long getId1() {
        return id1;
    }

    /**<br/>
     * 字段: t_user_copy.id1<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 19<br/>
     * @param id1: ID
     */
    public void setId1(Long id1) {
        this.id1 = id1;
    }
}