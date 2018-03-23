package com.jftang3.auth.dao;

import com.jftang3.auth.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PermissionDao {

    @Select("SELECT p.* FROM t_user as u " +
            "LEFT JOIN t_user_group as ug ON u.group_id = ug.id " +
            "LEFT JOIN t_user_group_permission as gp ON gp.user_group_id = ug.id " +
            "LEFT JOIN t_permission as p ON p.id = gp.permission_id " +
            "WHERE u.id = #{id}")
    List<Permission> getPermissionByUserId(Integer id);
}
