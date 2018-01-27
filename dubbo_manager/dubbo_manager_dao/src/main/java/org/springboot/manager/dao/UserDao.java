package org.springboot.manager.dao;

import org.springboot.manager.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    User getUser();

    void insertUser(User user);
}
