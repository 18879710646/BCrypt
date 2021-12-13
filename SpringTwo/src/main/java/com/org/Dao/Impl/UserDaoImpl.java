package com.org.Dao.Impl;

import com.org.Dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author HP
 * @Date 2021/11/6 15:06
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Repository("user")
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("已经执行了UserDaoImpl中的add");
    }
}
