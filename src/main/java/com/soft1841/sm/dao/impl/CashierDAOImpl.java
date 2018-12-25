package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.CashierDAO;
import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;

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

    private Cashier converCashier(Entity entity) {
        Cashier cashier = new Cashier(entity.getLong("id"),entity.getStr("name"),
                entity.getStr("number"),entity.getStr("sexuality"),entity.getStr("age"),
                entity.getStr("picture"),entity.getStr("account"),entity.getStr("password"));
        return cashier;
    }
}
