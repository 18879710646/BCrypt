package com.org.Service.Impl;

import com.org.Dao.UserDao;
import com.org.Service.Service;

/**
 * @Author HP
 * @Date 2021/11/6 11:13
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class ServiceImpl implements Service {
    private UserDao userDao;

    public void setAddress(String address) {
        this.address = address;
        System.out.println("address"+this.address);
    }
    private  String address;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;

        System.out.println("setUserDao="+this.userDao);
        userDao.show();
    }

    public void add() {
        System.out.println("来到了ServiceImpl中的add中");
        userDao.add();
    }

    public void delete() {
        System.out.println("来到了ServiceImpl中的delete中");
    }
}
