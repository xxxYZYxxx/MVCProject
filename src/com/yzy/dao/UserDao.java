package com.yzy.dao;

import com.yzy.beans.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();
    int addUser(User user);
}
