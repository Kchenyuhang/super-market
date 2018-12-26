package com.soft1841.sm.service;

import com.soft1841.sm.dao.GoodsDAO;
import com.soft1841.sm.entity.Goods;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.until.ServiceFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoodsServiceTest{
    private GoodsService goodsService = ServiceFactory.getGoodsServiceInstance();
    @Test
    public void addGoods() {
        Goods goods = new Goods (  );
        goods.setName ("测试新类别");
        goodsService.addGoods(goods);

    }

    @Test
    public void deleteGoods() {
        goodsService.deleteGoods(161);
    }

    @Test
    public void updateGoods() {
        Goods goods = new Goods (  );
        goods.setId ( 161 );
        goods.setPrice(11.1);


        goodsService.updateGoods(goods);
    }

    @Test
    public void getAllGoods() {
    }

    @Test
    public void getGoods() {
    }

    @Test
    public void getGoodsLike() {
    }

    @Test
    public void getGoodsByTypeId() {
    }

    @Test
    public void countByType() {
    }
}