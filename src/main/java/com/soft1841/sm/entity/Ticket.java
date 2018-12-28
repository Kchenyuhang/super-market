package com.soft1841.sm.entity;

import cn.hutool.db.Entity;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Ticket extends Entity {
   private Long id;
   private Long cashierid;
   private Long vipid;
   private String date;
   private String money;
   public Ticket(){

   }
   public Ticket(Long id,Long cashierid,Long vipid,String date,String money){
       this.id = id;
       this.cashierid = cashierid;
       this.vipid = vipid;
       this.date = date;
       this.money = money;
   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCashierid() {
        return cashierid;
    }

    public void setCashierid(Long cashierid) {
        this.cashierid = cashierid;
    }

    public Long getVipid() {
        return vipid;
    }

    public void setVipid(Long vipid) {
        this.vipid = vipid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", cashierid=" + cashierid +
                ", vipid=" + vipid +
                ", date='" + date + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
