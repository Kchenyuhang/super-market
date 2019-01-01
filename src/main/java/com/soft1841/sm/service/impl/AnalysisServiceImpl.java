package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.GoodsDAO;
import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.service.AnalysisService;
import com.soft1841.sm.until.DAOFactory;

import java.sql.SQLException;

public class AnalysisServiceImpl implements AnalysisService{
    private TypeDAO typeDAO = DAOFactory.getTypeDAOInstance();
    private GoodsDAO goodsDAO = DAOFactory.getGoodsDAOInstance();
    @Override
    public int getTypesCount() {
        int n = 0;
        try {
            n = typeDAO.countTypes();
        } catch (SQLException e) {
            System.err.println("统计类别总数出现异常");
        }
        return n;
    }
    @Override
    public int getGoodsCount() {
        int n = 0;

        try {
            n = goodsDAO.countGoods();
        } catch (SQLException e) {
            System.err.println("统计商品总数出现异常");
        }
        return n;
    }
}