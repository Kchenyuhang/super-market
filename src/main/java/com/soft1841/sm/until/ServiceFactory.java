package com.soft1841.sm.until;

import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.dao.impl.CashierServiceImpl;

public class ServiceFactory {
    public static CashierService getCashierServiceInstance() {
        return new CashierServiceImpl();
    }
}
