package com.org.Service;

import com.org.PoJo.User;

import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/20 10:50
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public interface Service {
    List<User> FindAll();
    void Bank(String name1,String name2,int money);
}
