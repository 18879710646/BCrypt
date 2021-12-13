package com.org.Test;

import com.org.Dao.UserDao;
import com.org.Service.Service;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import  org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author HP
 * @Date 2021/11/6 15:10
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class Test {
//     这个表示为自动装配，自动注入
    @Autowired
    private Service service;
    @org.junit.Test
    public void a(){
        service.add();
        service.name();
    }

    // 这个表示为根据之前命名的name来获取到容器中的对象,通过在@Repository（"user"），获取到对应的对象
    @Resource(name = "user")
    private UserDao userDao;
    @org.junit.Test
    public void b(){
        userDao.add();
    }
}
