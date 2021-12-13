package com.org.Dao;

import com.org.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author HP
 * @Date 2021/10/30 13:54
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public interface Userdao {
    // 查询全部数据
    List<User> findAll();
    // 按照id来查询数据
    List<User> findId(int id);

    //增加数据
    int  findAdd(User user);

    // 删除数据
    Boolean deleteId(int id);
    // 模糊查询#
    List<User> findlikeId(String username);
    //模糊查询$
    List<User> findlikeId2(String username);

    // 更新数据
    Boolean UploadById(User user);

    //动态Sql(if)
    List<User> findAllsqlif(User user);

    // 动态sql(where)
    List<User> findAllWhere(User user);

    // 动态sql（Forench）
    List<User> findAllForench( List<Integer> list);
}
