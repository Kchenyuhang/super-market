package com.soft1841.sm.dao;

import com.soft1841.sm.entity.VIP;
import com.soft1841.sm.until.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class VIPDAOTest {
    private VIPDAO vipDAO = DAOFactory.getVIPDAOInstance();

    @Test
    public void insertVIP() throws SQLException {
        VIP vip = new VIP();
        vip.setId(3l);
        vip.setName("柳磊磊");
        vip.setProvince("甘肃");
        vip.setNumber("0");
        vip.setPhone("12345678911");

        System.out.println(vipDAO.insertVIP(vip));
    }

    @Test
    public void deleteVIPById() throws SQLException {
        vipDAO.deleteVIPById(7);
    }

    @Test
    public void selectAllVIPs() throws SQLException {
        List<VIP> vipList = vipDAO.selectVIP();
        vipList.forEach(vip -> System.out.println(vip));
    }

    @Test
    public void getVIPId() throws SQLException {
        VIP vip = vipDAO.getVIPById(1);
        System.out.println(vip);
    }
}