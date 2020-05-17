package com.example.maintain.bean;

import java.util.Date;

public class Order {

    private Integer orderId;   //工单ID
    private Integer userId;    //提交工单的用户ID
    private Date createTime;   //创建时间
    private String details;    //工单详细描述
    private String type;       //工单问题类型
    private String phone;      //维修预留手机号
    private String address;    //维修地址
    private Date allocatedTime;//分配维修人员时间
    private String maintainValue;//维修内容
    private Date successTime;  //维修完成时间
    private String evaluationValue;//工单评价内容
    private Date evaluationTime; //工单评价时间
    private Date confirmTime;  //管理员确认时间
    private Integer status;    //当前状态

    public Order() {
    }

    public Order(Integer orderId, Integer userId, Date createTime, String details, String type, String phone, String address, Date allocatedTime, String maintainValue, Date successTime, String evaluationValue, Date evaluationTime, Date confirmTime, Integer status) {
        this.orderId = orderId;
        this.userId = userId;
        this.createTime = createTime;
        this.details = details;
        this.type = type;
        this.phone = phone;
        this.address = address;
        this.allocatedTime = allocatedTime;
        this.maintainValue = maintainValue;
        this.successTime = successTime;
        this.evaluationValue = evaluationValue;
        this.evaluationTime = evaluationTime;
        this.confirmTime = confirmTime;
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAllocatedTime() {
        return allocatedTime;
    }

    public void setAllocatedTime(Date allocatedTime) {
        this.allocatedTime = allocatedTime;
    }

    public String getMaintainValue() {
        return maintainValue;
    }

    public void setMaintainValue(String maintainValue) {
        this.maintainValue = maintainValue;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public String getEvaluationValue() {
        return evaluationValue;
    }

    public void setEvaluationValue(String evaluationValue) {
        this.evaluationValue = evaluationValue;
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", details='" + details + '\'' +
                ", type='" + type + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", allocatedTime=" + allocatedTime +
                ", maintainValue='" + maintainValue + '\'' +
                ", successTime=" + successTime +
                ", evaluationValue='" + evaluationValue + '\'' +
                ", evaluationTime=" + evaluationTime +
                ", confirmTime=" + confirmTime +
                ", status=" + status +
                '}';
    }
}
