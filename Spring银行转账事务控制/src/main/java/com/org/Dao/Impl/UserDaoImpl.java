package com.org.Dao.Impl;

import com.org.Bean.Bank;
import com.org.Dao.UserDao;
import com.org.Mange.LocalMange;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/8 21:29
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private QueryRunner queryRunner;
    @Autowired
    private LocalMange localMange;
    //付钱
    public void fuqian(String name ,int money) throws SQLException{
        String Sql="update bank set fmoney=fmoney-? where name=?";
      queryRunner.update(localMange.Conner(),Sql, money,name);
    }

    public void shouqian(String name ,int money) throws SQLException {
        String Sql="update bank set smoney=smoney+? where name=?";
        queryRunner.update(localMange.Conner(),Sql, money, name);
    }
}
