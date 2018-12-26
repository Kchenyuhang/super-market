package com.soft1841.sm.until;

import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.service.impl.AdminServiceImpl;
import com.soft1841.sm.service.impl.CashierServiceImpl;

/**
 * 业务逻辑类工厂
 */
public class ServiceFactory {

    public static CashierService getCashierServiceInstance() {
        return new CashierServiceImpl();
    }

    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }


        }



