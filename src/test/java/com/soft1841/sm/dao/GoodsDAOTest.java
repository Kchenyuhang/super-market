package com.soft1841.sm.dao;
/**
 * @ author 汤萌慧
 * 2018.12.26
 */

import com.soft1841.sm.entity.Goods;
import com.soft1841.sm.until.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;


public class GoodsDAOTest{
    private GoodsDAO goodsDAO = DAOFactory.getGoodsDAOInstance();
    @Test
    public void insertGoods () throws SQLException{
        Goods goods = new Goods();
        goods.setTypeId(1);

        goods.setName("测试书籍");

        goods.setPicture("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2511831665.jpg");

        goods.setPrice(68.8);

        goods.setDescription("测试商品描述测试商品描述测试商品描述测试商品描述测试商品描述");

        System.out.println(goodsDAO.insertGoods(goods));

    }



    @Test
    public void deleteGoodsById() throws SQLException {
        goodsDAO.deleteGoodsById ( 40 );
    }

    @Test
    public void updateGoods() throws SQLException {
       Goods goods = new Goods (  );

        goods.setId(40);

        goods.setPrice(11.1);


        goodsDAO.updateGoods(goods);
    }

    @Test
    public void selectAllGoods() throws SQLException {
        List<Goods> goodsList = goodsDAO.selectAllGoods();

       goodsList.forEach(goods -> System.out.println(goods.getName()));
    }

    @Test
    public void getGoodById()  throws  SQLException{
        Goods goods = goodsDAO.getGoodsById( (long) 1 );
        System.out.println(goods.getName());
    }

    @Test
    public void selectGoodsByTypeId() throws SQLException {
        List<Goods> goodsList = goodsDAO.selectGoodsByTypeId(1);

        goodsList.forEach(goods -> System.out.println(goods.getName()));
    }

    @Test
    public void selectGoodsLike() throws SQLException {
        List<Goods> goodsList = goodsDAO.selectGoodsLike ( "少" );

        goodsList.forEach(goods -> System.out.println(goods.getName()));

    }

    @Test
    public void countByType() throws SQLException {
        int n = goodsDAO.countByType(1);

        System.out.println(n);

    }
}