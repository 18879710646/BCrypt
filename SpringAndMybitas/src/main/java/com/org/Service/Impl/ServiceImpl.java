package com.org.Service.Impl;

import com.org.Dao.UserDao;
import com.org.Service.Service;

/**
 * @Author HP
 * @Date 2021/11/6 13:43
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class ServiceImpl implements Service {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.Select();
    }
}
