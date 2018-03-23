package com.jftang3.auth.dao;

import com.jftang3.auth.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("SELECT * FROM t_user WHERE username = #{name}")
    User getUserByName(@Param("name") String username);

}
