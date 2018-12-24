package com.soft1841.sm.until;

import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;
import com.soft1841.sm.entity.Cashier;

public class DAOFactory {
    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }
}
