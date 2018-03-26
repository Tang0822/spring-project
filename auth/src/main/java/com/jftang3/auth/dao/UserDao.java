package com.jftang3.auth.dao;

import com.jftang3.auth.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("SELECT * FROM t_user")
    List<User> getAllUser();

    @Select("SELECT * FROM t_user WHERE username = #{name}")
    User getUserByName(@Param("name") String username);

    @Insert("INSERT INTO t_user (username, password, group_id) VALUES (#{user.username}, #{user.password}, #{user.groupId})")
    Integer saveUser(@Param("user") User user);

    @Update("UPDATE t_user SET `password` = #{user.password}, username = #{user.username}, group_id = #{user.groupId} WHERE id = #{user.id}")
    Integer updateUser(@Param("user") User user);

}
