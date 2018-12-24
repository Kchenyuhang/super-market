package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.CashierDAO;
import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

public class CashierDAOImpl implements CashierDAO {
    @Override
    public Cashier getCashierByAccount(String account) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_cashier WHERE account =? ", account);
        return convertCashier(entity);
    }

    private Cashier convertCashier(Entity entity) {
        Cashier cashier = new Cashier(entity.getLong("id"),entity.getStr("number"),
                entity.getStr("name"),entity.getStr("password"),entity.getStr("picture"));
        return cashier;
    }

    @Override
    public long insertCashier(Cashier cashier) throws SQLException {
        return 0;
    }

    @Override
    public int deleteById(long id) throws SQLException {
        return 0;
    }

    @Override
    public List<Cashier> selectCashier() throws SQLException {
        return null;
    }

    @Override
    public Cashier getCashierById(long id) throws SQLException {
        return null;
    }
}
