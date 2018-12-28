package com.soft1841.sm.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 类别实体类
 * @auther 柳磊磊
 * 2018 12.26
 */
public class Type {

    private String type;
    private final SimpleLongProperty id = new SimpleLongProperty();
    private final SimpleStringProperty typeName = new SimpleStringProperty("");

    public Type() {
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getTypeName() {
        return typeName.get();
    }

    public SimpleStringProperty typeNameProperty() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName.set(typeName);
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", typeName=" + typeName +
                '}';
    }
}
