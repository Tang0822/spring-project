package com.jftang3.auth.service;

import com.jftang3.auth.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserByName(@Param("name") String username);

    Integer saveUser(@Param("user") User user);

    Integer updateUser(@Param("user") User user);
}
