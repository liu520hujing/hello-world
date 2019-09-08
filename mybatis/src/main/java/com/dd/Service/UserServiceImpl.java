package com.dd.Service;

import com.dd.Dao.UserDao;
import com.dd.Entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements  UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User selectUserById(Integer userId) {
        System.out.println(userDao.selectUserById(userId));
        return userDao.selectUserById(userId);
    }

}
