package com.org.Dao;

import com.org.PoJo.User;

import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/20 11:08
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public interface Userdao {
    List<User>  FindAll();
    void add(User user);
    void jian(User user);
}
