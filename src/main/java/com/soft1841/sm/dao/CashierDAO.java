package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

/**
 * 收银员DAO接口
 * @author 陈宇航
 * 2018.12.24
 */
public interface CashierDAO {

    /**
     * 根据工号查询收银员
     * @param account
     * @return
     * @throws SQLException
     */
    Cashier getCashierByAccount(String account) throws SQLException;
}
