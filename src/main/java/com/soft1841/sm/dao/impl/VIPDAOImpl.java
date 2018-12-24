package com.soft1841.sm.dao.impl;

import com.soft1841.sm.dao.VIPDAO;
import com.soft1841.sm.entity.VIP;

import java.sql.SQLException;
import java.util.List;

public class VIPDAOImpl implements VIPDAO {
    @Override
    public long insertVIP(VIP vip) throws SQLException {
        return 0;
    }

    @Override
    public int deleteById(long id) throws SQLException {
        return 0;
    }

    @Override
    public List<VIP> selectVIP() throws SQLException {
        return null;
    }

    @Override
    public VIP getVIPById(long id) throws SQLException {
        return null;
    }
}
