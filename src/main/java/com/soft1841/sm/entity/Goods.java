package com.soft1841.sm.entity;
/**
 * 商品实体类
 * @author 汤萌慧
 * 2018.12.26
 */

import cn.hutool.db.Entity;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
public class Goods extends Entity{
    private final SimpleLongProperty id = new SimpleLongProperty();
    private final SimpleLongProperty typeId = new SimpleLongProperty();
    private final SimpleStringProperty name = new SimpleStringProperty("");
    private final SimpleDoubleProperty price = new SimpleDoubleProperty();
    private final SimpleStringProperty picture = new SimpleStringProperty("");
    private final SimpleStringProperty description = new SimpleStringProperty("");
    public Goods() {
    }
    public Goods(Long id, Long typeId, String name,  Double price, String picture, String description) {
        setId(id);
        setTypeId(typeId);
        setName(name);
        setPrice(price);
        setPicture (picture);
        setDescription(description);
    }
    public long getId() {
        return id.get();
    }
    public SimpleLongProperty idProperty() {
        return id;
    }
    public void setId(long id) {
        this.id.set(id);
    }
    public long getTypeId() {
        return typeId.get();
    }
    public SimpleLongProperty typeIdProperty() {
        return typeId;
    }
    public void setTypeId(long typeId) {
        this.typeId.set(typeId);
    }
    public String getName() {
        return name.get();
    }
    public SimpleStringProperty nameProperty() {
        return name;
    }
    public void setName(String name) {
        this.name.set(name);
    }
    public double getPrice() {
        return price.get();
    }
    public SimpleDoubleProperty priceProperty() {
        return price;
    }
    public void setPrice(double price) {
        this.price.set(price);
    }
    public String getPicture() {
        return picture.get();
    }
    public SimpleStringProperty pictureProperty() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture.set(picture);
    }
    public String getDescription() {
        return description.get();
    }
    public SimpleStringProperty descriptionProperty() {
        return description;
    }
    public void setDescription(String description) {
        this.description.set(description);
    }
}