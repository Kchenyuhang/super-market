package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.VIPDAO;
import com.soft1841.sm.entity.VIP;
import com.soft1841.sm.service.VIPService;
import com.soft1841.sm.until.DAOFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VIPServiceImpl implements VIPService {
    private VIPDAO vipDAO = DAOFactory.getVIPDAOInstance();
    @Override
    public List<VIP> getAllVIP() {
        List<VIP> vipList = new ArrayList<>();
        try {
            vipList = vipDAO.selectVIP();
        } catch (SQLException e) {
            System.err.println("查询所有会员信息出现异常");
        }
        return vipList;
    }

    @Override
    public VIP getVIP(long id) {
        VIP vip = new VIP();
        try {
            vip = vipDAO.getVIPById(id);
        } catch (SQLException e) {
            System.err.println("查询单个会员信息出现异常");
        }
        return vip;
    }

    @Override
    public Long addVIP(VIP vip) {
        long result = 0;
        try {
            result = vipDAO.insertVIP(vip);
        } catch (SQLException e) {
            System.out.println("新增会员信息出现异常");
        }
        return result;
    }

    @Override
    public void deleteVIP(long id) {
        try {
            vipDAO.deleteVIPById(id);
        } catch (SQLException e) {
            System.err.println("删除会员信息出现异常");
        }
    }
}
