package com.qianfeng.pojo;

public class Person {
    private Integer perId;

    private String perName;

    private String perCompany;

    private String perEmail;

    private String perPhone;

    private String perAddr;

    private Integer perUserId;

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getPerCompany() {
        return perCompany;
    }

    public void setPerCompany(String perCompany) {
        this.perCompany = perCompany == null ? null : perCompany.trim();
    }

    public String getPerEmail() {
        return perEmail;
    }

    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail == null ? null : perEmail.trim();
    }

    public String getPerPhone() {
        return perPhone;
    }

    public void setPerPhone(String perPhone) {
        this.perPhone = perPhone == null ? null : perPhone.trim();
    }

    public String getPerAddr() {
        return perAddr;
    }

    public void setPerAddr(String perAddr) {
        this.perAddr = perAddr == null ? null : perAddr.trim();
    }

    public Integer getPerUserId() {
        return perUserId;
    }

    public void setPerUserId(Integer perUserId) {
        this.perUserId = perUserId;
    }
}