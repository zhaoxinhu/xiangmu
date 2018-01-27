package org.springboot.manager.service.impl;

import org.springboot.manager.dao.UserDao;
import org.springboot.manager.pojo.User;
import org.springboot.manager.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Autowired
    private UserDao userDao;
    @Override
    public User getUser() {
        return userDao.getUser();
    }
}
