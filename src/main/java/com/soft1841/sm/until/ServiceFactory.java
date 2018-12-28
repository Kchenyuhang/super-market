package com.soft1841.sm.until;

import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.dao.impl.TypeDAOImpl;
import com.soft1841.sm.service.*;
import com.soft1841.sm.service.impl.*;

/**
 * 业务逻辑类工厂
 * @auther 小组成员
 */
public class ServiceFactory {

    public static CashierService getCashierServiceInstance() {
        return new CashierServiceImpl();
    }

    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }
    public static VIPService getVIPServiceInstance() {
        return new VIPServiceImpl();
    }
    public static TypeService getTypeServiceInstance(){
        return new TypeServiceImpl();
    }
    public static GoodsService getGoodsServiceInstance(){
        return new GoodsServiceImpl();
    }

}


