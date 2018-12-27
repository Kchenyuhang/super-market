package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.CashierDAO;
import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class CashierDAOImpl implements CashierDAO{

    /**
     * 收银员查询方法
     * @param account
     * @return
     * @throws SQLException
     */
    @Override
    public Cashier getCashierByAccount(String account) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_cashiers WHERE account = ? ",account);
        return converCashier(entity);
    }

    @Override
    public List<Cashier> selectCashiers() throws SQLException {
        List<Entity> entityList = Db.use().query("SELECT * FROM t_cashiers ");
        List<Cashier> cashierList = new ArrayList<>();
        for (Entity entity : entityList) {
            cashierList.add(converCashier(entity));
        }
        return cashierList;
    }

    @Override
    public int deleteById(long id) throws SQLException {
        return Db.use().del(Entity.create("t_cashiers").set("id",id));
    }

    @Override
    public Long insertCashier(Cashier cashier) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_cashiers")
                .set("picture",cashier.getPicture())
                        .set("name",cashier.getName())
                        .set("number",cashier.getNumber())
                        .set("sexuality",cashier.getSexuality())
                        .set("age",cashier.getAge())
                        .set("account",cashier.getAccount())
                        .set("password",cashier.getPassword())
                        .set("role",cashier.getRole())
                        .set("department",cashier.getDepartment()));
    }

    @Override
    public int countByRole(String role) throws SQLException {
        return Db.use().queryNumber("SELECT COUNT(*) FROM t_cashiers WHERE role = ? ",role).intValue();
    }

    @Override
    public int countByDepartment(String department) throws SQLException {
        return Db.use().queryNumber("SELECT COUNT(*) FROM t_cashiers WHERE department = ?", department).intValue();
    }

    /**
     * 将Entity转换为Cashier
     * @param entity
     * @return
     */
    private Cashier converCashier(Entity entity) {
        Cashier cashier = new Cashier();
        cashier.setId(entity.getLong("id"));
        cashier.setName(entity.getStr("name"));
        cashier.setNumber(entity.getStr("sexuality"));
        cashier.setAge(entity.getStr("age"));
        cashier.setPicture(entity.getStr("picture"));
        cashier.setAccount(entity.getStr("account"));
        cashier.setPassword(entity.getStr("password"));
        cashier.setRole(entity.getStr("role"));
        cashier.setDepartment(entity.getStr("department"));
        return cashier;
    }
}
