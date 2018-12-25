package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.CashierDAO;
import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.until.DAOFactory;

import java.sql.SQLException;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class CashierServiceImpl implements CashierService{
    private CashierDAO cashierDAO = DAOFactory.getCashierDAOInstance();

    @Override
    public boolean login(String account, String password) {
        Cashier cashier = null;
        try {
            cashier = cashierDAO.getCashierByAccount(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据账号查找成功
        if (cashier != null) {
            //比较密码
            if (password.equals(cashier.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
