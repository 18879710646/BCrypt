package com.org.Service.Impl;

import com.org.Dao.UserDao;
import com.org.Service.Service;

/**
 * @Author HP
 * @Date 2021/11/6 14:27
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */


public class ServiceImpl implements Service {
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        userDao.add();
    }

    private UserDao userDao;

    public void setAddress(String address) {
        this.address = address;
        System.out.println("address="+this.address);
    }

    private String address;
    public void add() {
        System.out.println("现在是在ServiceImpl中的add");
    }
}
