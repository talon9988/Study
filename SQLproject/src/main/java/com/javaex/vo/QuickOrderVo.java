package com.javaex.vo; // Ensure this package matches your project structure

import java.util.Date;

public class QuickOrderVo {

    private int orderNo;
    private String fullName;
    private String userId;
    private String email;
    private String contact;
    private String password; // In a real application, do not store raw passwords
    private String productType;
    private int orderQuantity;
    private String agreePersonalInfo; // "Y" or "N"
    private String agreeServiceTerms; // "Y" or "N"
    private String agreeEmailAds;     // "Y" or "N"
    private Date orderDate;

    // Constructors
    public QuickOrderVo() {
    }

    public QuickOrderVo(String fullName, String userId, String email, String contact, String password,
                        String productType, int orderQuantity, String agreePersonalInfo,
                        String agreeServiceTerms, String agreeEmailAds) {
        this.fullName = fullName;
        this.userId = userId;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.productType = productType;
        this.orderQuantity = orderQuantity;
        this.agreePersonalInfo = agreePersonalInfo;
        this.agreeServiceTerms = agreeServiceTerms;
        this.agreeEmailAds = agreeEmailAds;
    }


    public QuickOrderVo(int orderNo, String fullName, String userId, String email, String contact, String password,
                        String productType, int orderQuantity, String agreePersonalInfo,
                        String agreeServiceTerms, String agreeEmailAds, Date orderDate) {
        this.orderNo = orderNo;
        this.fullName = fullName;
        this.userId = userId;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.productType = productType;
        this.orderQuantity = orderQuantity;
        this.agreePersonalInfo = agreePersonalInfo;
        this.agreeServiceTerms = agreeServiceTerms;
        this.agreeEmailAds = agreeEmailAds;
        this.orderDate = orderDate;
    }

    // Getters and Setters
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getAgreePersonalInfo() {
        return agreePersonalInfo;
    }

    public void setAgreePersonalInfo(String agreePersonalInfo) {
        this.agreePersonalInfo = agreePersonalInfo;
    }

    public String getAgreeServiceTerms() {
        return agreeServiceTerms;
    }

    public void setAgreeServiceTerms(String agreeServiceTerms) {
        this.agreeServiceTerms = agreeServiceTerms;
    }

    public String getAgreeEmailAds() {
        return agreeEmailAds;
    }

    public void setAgreeEmailAds(String agreeEmailAds) {
        this.agreeEmailAds = agreeEmailAds;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "QuickOrderVo{" +
                "orderNo=" + orderNo +
                ", fullName='" + fullName + '\'' +
                ", userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", password='[PROTECTED]'" + // Avoid logging password
                ", productType='" + productType + '\'' +
                ", orderQuantity=" + orderQuantity +
                ", agreePersonalInfo='" + agreePersonalInfo + '\'' +
                ", agreeServiceTerms='" + agreeServiceTerms + '\'' +
                ", agreeEmailAds='" + agreeEmailAds + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
