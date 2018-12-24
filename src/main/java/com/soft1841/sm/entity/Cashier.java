package com.soft1841.sm.entity;

/**
 * 收银员实体类
 * @author 陈宇航
 * 2018.12.24
 */
public class Cashier {
    private Long id;
    private String name;
    private String number;
    private String sexuality;
    private String age;
    private String picture;
    private String account;
    private String password;

    public Cashier() {
    }

    public Cashier(Long id, String name, String number, String sexuality, String age, String picture, String account, String password) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.sexuality = sexuality;
        this.age = age;
        this.picture = picture;
        this.account = account;
        this.password = password;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSexuality() {
        return sexuality;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", sexuality='" + sexuality + '\'' +
                ", age='" + age + '\'' +
                ", picture='" + picture + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
