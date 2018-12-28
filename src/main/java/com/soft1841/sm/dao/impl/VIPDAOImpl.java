package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.VIPDAO;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.entity.VIP;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VIPDAOImpl implements VIPDAO {
    @Override
    public long insertVIP(VIP vip) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_vip")
                        .set("number", vip.getNumber())
                .set("name",vip.getName())
                .set("phone",vip.getPhone())
                .set("province",vip.getProvince())
        );
    }



    @Override
    public int deleteVIPById(long id) throws SQLException {
        return Db.use().del(
                Entity.create("t_vip")
                .set("id",id)
        );
    }

    @Override
    public List<VIP> selectVIP() throws SQLException {
        List<Entity> entityList = Db.use().query("SELECT * FROM t_vip");
        List<VIP> vipList = new ArrayList<>();
        for (Entity entity:entityList
             ) {
            vipList.add(convertVIP(entity));

        }
        return vipList;
    }


    @Override
    public VIP getVIPById(long id) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_vip WHERE id = ?", id);
        return convertVIP(entity);
    }
    private VIP convertVIP(Entity entity) {
        VIP vip = new VIP();
        vip.setId(entity.getLong("id"));
        vip.setNumber(entity.getStr("number"));
        vip.setName(entity.getStr("name"));
        vip.setProvince(entity.getStr("province"));
        vip.setPhone(entity.getStr("phone"));
        return vip;
    }
}
