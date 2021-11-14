package com.yzy.dao.impl;

import com.yzy.beans.User;
import com.yzy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getUserList() {

        return jdbcTemplate.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setPhoneNumber(resultSet.getString("uphone"));
                user.setUsername(resultSet.getString("uname"));
                user.setPassword(resultSet.getString("upassword"));
                user.setMailAddress(resultSet.getString("umail"));
                return user;
            }
        });
    }

    @Override
    public int addUser(User user){
        String sql="insert into user values(?,?,?,?)";
        return jdbcTemplate.update(sql,user.getPhoneNumber(),user.getUsername(),user.getPassword(),user.getMailAddress());
    }
}
