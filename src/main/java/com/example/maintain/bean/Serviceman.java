package com.example.maintain.bean;

public class Serviceman {
    private Integer servicemanId;       //维修人员ID
    private String servicemanName;      //维修人员名字
    private String servicemanPhone;     //维修人员手机号码
    private String servicemanPassword;  //维修人员密码
    private Integer type;               //维修人员所属类型
    private String department;          //维修人员所属部门
    private String address;             //维修人员住址

    public Serviceman() {
    }

    public Serviceman(Integer servicemanId, String servicemanName, String servicemanPhone, String servicemanPassword, Integer type, String department, String address) {
        this.servicemanId = servicemanId;
        this.servicemanName = servicemanName;
        this.servicemanPhone = servicemanPhone;
        this.servicemanPassword = servicemanPassword;
        this.type = type;
        this.department = department;
        this.address = address;
    }

    public Integer getServicemanId() {
        return servicemanId;
    }

    public void setServicemanId(Integer servicemanId) {
        this.servicemanId = servicemanId;
    }

    public String getServicemanName() {
        return servicemanName;
    }

    public void setServicemanName(String servicemanName) {
        this.servicemanName = servicemanName;
    }

    public String getServicemanPhone() {
        return servicemanPhone;
    }

    public void setServicemanPhone(String servicemanPhone) {
        this.servicemanPhone = servicemanPhone;
    }

    public String getServicemanPassword() {
        return servicemanPassword;
    }

    public void setServicemanPassword(String servicemanPassword) {
        this.servicemanPassword = servicemanPassword;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Serviceman{" +
                "servicemanId=" + servicemanId +
                ", servicemanName='" + servicemanName + '\'' +
                ", servicemanPhone='" + servicemanPhone + '\'' +
                ", servicemanPassword='" + servicemanPassword + '\'' +
                ", type=" + type +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
