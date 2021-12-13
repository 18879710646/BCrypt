package com.org.Dao;

import com.org.Bean.User;
import com.org.Bean.UserB;

import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/2 17:52
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public interface UserDao {
    List<UserB> FindAllByIdOnAndTwo();
}
