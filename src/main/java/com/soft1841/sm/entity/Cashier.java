package com.soft1841.sm.entity;

public class Cashier {
    private Long id;
    private String account;
    private String name;
    private String password;
    private String picture;

    public Cashier() {
    }

    public Cashier(Long id, String account, String name, String password, String picture) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.password = password;
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Cashier{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
