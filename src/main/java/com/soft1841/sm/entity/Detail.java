package com.soft1841.sm.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Detail {
    private final SimpleLongProperty id = new SimpleLongProperty();
    private final SimpleLongProperty ticket_id = new SimpleLongProperty();
    private final SimpleStringProperty goods_code = new SimpleStringProperty();
    private final SimpleStringProperty number = new SimpleStringProperty();
    public Detail(){
    }
    public Detail(Long id,Long ticket_id,String goods_code,String number){
        setId(id);
        setTicket_id(ticket_id);
        setGoods_code(goods_code);
        setNumber(number);

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

    public long getTicket_id() {
        return ticket_id.get();
    }

    public SimpleLongProperty ticket_idProperty() {
        return ticket_id;
    }

    public void setTicket_id(long ticket_id) {
        this.ticket_id.set(ticket_id);
    }

    public String getGoods_code() {
        return goods_code.get();
    }

    public SimpleStringProperty goods_codeProperty() {
        return goods_code;
    }

    public void setGoods_code(String goods_code) {
        this.goods_code.set(goods_code);
    }

    public String getNumber() {
        return number.get();
    }

    public SimpleStringProperty numberProperty() {
        return number;
    }

    public void setNumber(String number) {
        this.number.set(number);
    }
}
