package com.soft1841.sm.dao.impl;

import com.soft1841.sm.dao.GoodsDAO;
import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.List;

public class GoodsDAOImpl implements GoodsDAO {
    @Override
    public Long insertGoods(Goods goods) throws SQLException {
        return null;
    }

    @Override
    public int deleteGoodsById(long id) throws SQLException {
        return 0;
    }

    @Override
    public int updateGoods(Goods goods) throws SQLException {
        return 0;
    }

    @Override
    public List<Goods> selectAllGoods() throws SQLException {
        return null;
    }

    @Override
    public Goods getGoodById(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Goods> selectGoodsByTypeId(long typeId) throws SQLException {
        return null;
    }

    @Override
    public List<Goods> selectGoodsLike(String keywords) throws SQLException {
        return null;
    }

    @Override
    public int countByType(long typeId) throws SQLException {
        return 0;
    }
}
