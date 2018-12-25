package com.soft1841.sm.until;

import cn.hutool.db.Entity;
import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;
import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;

public class DAOFactory {
    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }
    public static AdminDAO getAdminDAOInstance() {
        return new AdminDAOImpl();
    }
    public static TypeDAO getTypeDAOInstance    () {

        return new TypeDAOImpl() {
        };
    }
}
