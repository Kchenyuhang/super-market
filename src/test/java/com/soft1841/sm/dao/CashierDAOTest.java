package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.until.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;



public class CashierDAOTest {
    private CashierDAO cashierDAO = DAOFactory.getCashierDAOInstance();

    @Test
    public void getCashierByAccount() throws SQLException {
        Cashier cashier = cashierDAO.getCashierByAccount("chenyuhang");
        System.out.println(cashier);
    }
}