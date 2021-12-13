package com.org.Dao.Impl;

import com.org.Bean.User;
import com.org.Dao.UserDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/8 22:30
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private QueryRunner runner;
    public List<User> SelectBy() throws SQLException {
        String Sql="select * from bank";
        List<User> query = runner.query(Sql, new BeanListHandler<User>(User.class));
        return query;
    }
}
