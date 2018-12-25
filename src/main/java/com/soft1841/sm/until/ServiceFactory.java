package com.soft1841.sm.until;

import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.dao.impl.TypeDAOImpl;
import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.service.impl.AdminServiceImpl;
import com.soft1841.sm.service.impl.CashierServiceImpl;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class ServiceFactory {
    public static CashierService getCashierServiceInstance() {
        return new CashierServiceImpl();
    }
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }
    public static TypeDAO getTypeDAOInstance(){
        return new TypeDAOImpl();
    }
}
