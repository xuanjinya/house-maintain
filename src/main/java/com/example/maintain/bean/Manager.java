package com.example.maintain.bean;

public class Manager {
    private Integer managerId; //管理员ID
    private String managerName; //管理员名字
    private String managerPassword; //管理员密码
    private String managerPhone;  //管理员手机号码

    public Manager() {
    }

    public Manager(Integer managerId, String managerName, String managerPassword, String managerPhone) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerPassword = managerPassword;
        this.managerPhone = managerPhone;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", managerPassword='" + managerPassword + '\'' +
                ", managerPhone='" + managerPhone + '\'' +
                '}';
    }
}
