package com.yzy.service;

import com.yzy.beans.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    int addUser(User user);
}
