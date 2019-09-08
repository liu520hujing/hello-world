package com.dd.Dao;

import com.dd.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User selectUserById(Integer id);

}
