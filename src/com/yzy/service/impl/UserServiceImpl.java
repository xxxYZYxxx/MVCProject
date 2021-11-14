package com.yzy.service.impl;

import com.yzy.beans.User;
import com.yzy.dao.UserDao;
import com.yzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
