package org.luonianxin.study.design;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class RebateInfo {

    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private Date bizTime;   // 业务时间
    private String desc;    // 业务描述

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(Date bizTime) {
        this.bizTime = bizTime;
    }

    /**
     *  重载了set方法以便调用
     * @param bizTime
     */
    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong(bizTime));
    }

    public void setBizTime(Long bizTime) {
        this.bizTime = new Date(bizTime);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
