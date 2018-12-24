package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

/**
 * 收银员DAO接口
 */
public interface CashierDAO {


    Cashier getCashierByAccount(String account) throws SQLException;

    /**
     * 增加收银员
     * @param cashier
     * @return
     * @throws SQLException
     */
    long insertCashier(Cashier cashier) throws SQLException;

    /**
     * 删除收银员
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteById(long id) throws SQLException;

    /**
     * 查询所有收银员
     * @return
     * @throws SQLException
     */
    List<Cashier> selectCashier() throws SQLException;

    /**
     * 根据id查收银员
     * @param id
     * @return
     * @throws SQLException
     */
    Cashier getCashierById(long id) throws SQLException;
}
