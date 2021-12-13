package com.org.Service;

import com.org.Bean.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/14 16:18
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public interface Service {
    List<User> SelectById() throws SQLException;
    void Demo(String name,String fname ,int money) throws SQLException;

}
