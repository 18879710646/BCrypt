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
 * @Date 2021/11/6 16:48
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private QueryRunner runner;
    public void add(User user) throws SQLException {
        String sql="insert into cruda value(null,?,?,?)";
        runner.update(sql,user.getName(),user.getAge(),user.getAddress());
    }

    public List<User> SelectById() throws SQLException {
        String sql="select * from cruda";
//         我们在这里查找出来的是一个集合，所以我们在查找使用query的时候，必须要new出一个BeanListHandler，告诉runner我们返回List中的数据是User类型的
       List<User> list = runner.query(sql, new BeanListHandler<User>(User.class));
        return list;
    }

    public Boolean DeleteById(int id) throws SQLException {
        String sql="delete from cruda where id = ?";
        int update = runner.update(sql, id);
        if (update==1){
            return true;
        }
        return false;
    }

    public Boolean UploadById(User user) throws SQLException {
        String sql="update cruda set name=? , age=?,address=? where id=?";
        int update = runner.update(sql, user.getName(), user.getAge(), user.getAddress(), user.getId());
        if (update==1){
            return true;
        }
        return false;
    }
}
