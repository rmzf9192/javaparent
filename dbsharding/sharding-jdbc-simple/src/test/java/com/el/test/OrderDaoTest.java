package com.el.test;

import com.el.ShardingJdbsSimple;
import com.el.dao.DictDao;
import com.el.dao.OrderDao;
import com.el.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingJdbsSimple.class})
public class OrderDaoTest {

    @Autowired
    OrderDao orderDao;

    @Autowired
    UserDao userDao;

    @Autowired
    DictDao dictDao;

    @Test
    public void testInsertOrder(){
        for(int i=0;i<20;i++){
            orderDao.insertOrder(new BigDecimal(i),1L,"SUCCESS");
        }
    }

    @Test
    public void testInsertOrderByUserId(){
        for (int i = 0; i < 10; i++) {
            orderDao.insertOrder(new BigDecimal(i),1L,"SUCCESS");
        }
        for (int i = 0; i < 10; i++) {
            orderDao.insertOrder(new BigDecimal(i),2L,"SUCCESS");
        }
    }

    @Test
    public void testSelectOrderbyIds(){
        List<Long> ids = new ArrayList<>();
        ids.add(409357981642129408L);
        ids.add(409357981734404096L);

        List<Map> maps = orderDao.selectOrderbyIds(ids,2);
        System.out.println(maps);
    }


    @Test
    public void testInsertUser(){
        for (int i = 10 ; i<14; i++){
            Long id = i + 1L;
            userDao.insertUser(id,"姓名"+ id );
        }
    }

    @Test
    public void testSelectUserbyIds(){
        List<Long> userIds = new ArrayList<>();
        userIds.add(11L);
        userIds.add(12L);
        List<Map> users = userDao.selectUserbyIds(userIds);
        System.out.println(users);
    }

    @Test
    public void testSelectUserInfobyIds(){
        List<Long> userIds = new ArrayList<>();
        userIds.add(11L);
        userIds.add(12L);
        List<Map> users = userDao.selectUserInfobyIds(userIds);
        System.out.println(users);
    }
    @Test
    public void testInsertDict(){
        dictDao.insertDict(11L,"user_type","2","超级管理员");
        dictDao.insertDict(12L,"user_type","3","二级管理员");
    }
    @Test
    @Transactional
    public void testDeleteDict(){
        dictDao.deleteDict(11L);
        int i =1;
         i = i/0;
        dictDao.deleteDict(12L);
    }
}
