package com.example.maintain.bean;

import java.util.Date;

public class Picture {
    private Integer picId;  //图片ID
    private Integer orderId; //对应的工单ID
    private Date createTime; //上传时间
    private String purl;     //图片链接

    public Picture() {
    }

    public Picture(Integer picId, Integer orderId, Date createTime, String purl) {
        this.picId = picId;
        this.orderId = orderId;
        this.createTime = createTime;
        this.purl = purl;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "picId=" + picId +
                ", orderId=" + orderId +
                ", createTime=" + createTime +
                ", purl='" + purl + '\'' +
                '}';
    }
}
