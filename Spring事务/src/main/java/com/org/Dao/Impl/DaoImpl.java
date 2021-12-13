package com.org.Dao.Impl;

import com.mchange.v2.c3p0.DataSources;
import com.org.Bean.User;
import com.org.Dao.Dao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/14 16:09
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

@Repository
public class DaoImpl implements Dao {
//    @Autowired
//    private QueryRunner queryRunner;


//    public List<User> SelectById() throws SQLException {
//        String sql="select * from bank";
//        List<User> query = queryRunner.query(sql, new BeanListHandler<User>(User.class));
//        return query;
//    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> SelectById() {
        String sql = "select *from bank";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return query;
    }

    public void jiaqian(String name ,int money){
        String sql="update bank set smoney=smoney+? where name=?";
        jdbcTemplate.update(sql,money,name);
    }
    public void jianqian(String name ,int money){
        String ssql="update bank set smoney=smoney-? where name=?";
        jdbcTemplate.update(ssql,money,name);
    }
}
