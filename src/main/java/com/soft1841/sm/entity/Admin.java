package com.soft1841.sm.entity;

/**
 * 收银员DAO接口
 * @author 陈宇航
 * 2018.12.24
 */
public class Admin {
    private Long id;
    private String name;
    private String sexuality;
    private String account;
    private String password;
    private String picture;

    public Admin() {
    }

    public Admin(Long id, String name, String sexuality, String account, String password, String picture) {
        this.id = id;
        this.name = name;
        this.sexuality = sexuality;
        this.account = account;
        this.password = password;
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexuality() {
        return sexuality;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sexuality='" + sexuality + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
