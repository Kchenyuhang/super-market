package com.soft1841.sm.service;
/**
 * @author 汤萌慧
 * 2018.12.26
 */

import com.soft1841.sm.dao.GoodsDAO;
import com.soft1841.sm.entity.Goods;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.until.ServiceFactory;
import org.junit.Test;

import java.util.List;

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
        List<Goods> goodsList = goodsService.getAllGoods();

        goodsList.forEach(goods -> System.out.println(goods.getName()));
    }

    @Test
    public void getGoods() {
        System.out.println(goodsService.getGoods(1));
    }

    @Test
    public void getGoodsLike() {
        List<Goods> goodsList = goodsService.getGoodsLike ( "少" );

        goodsList.forEach(goods -> System.out.println(goods.getName()));
    }

    @Test
    public void getGoodsByTypeId() {
        List<Goods> goodsList = goodsService.getGoodsByTypeId ( 1 );

        goodsList.forEach(goods -> System.out.println(goods.getName()));
    }

    @Test
    public void countByType() {
        int n = goodsService.countByType(1);

        System.out.println(n);
    }
}