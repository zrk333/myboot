package com.zrk.dao;

import com.zrk.pojo.User;

import java.util.List;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2019/5/12
 */
public interface UserDao {

    List<User> getAllUser();

    User getUserById(Integer id);
}
