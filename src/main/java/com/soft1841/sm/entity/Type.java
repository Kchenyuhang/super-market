package com.soft1841.sm.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 类别实体类
 * @auther 柳磊磊
 * 2018 12.26
 */
public class Type {

    private String typeName;
    private long id;

    public Type() {
    }

    public Type(String typeName , long id) {
        this.typeName = typeName;
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  typeName ;
    }
}
