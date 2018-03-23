package com.jftang3.auth.service;

import com.jftang3.auth.entity.Permission;

import java.util.List;

public interface PermissionService {

    List<Permission> getPermissionByUserId(Integer id);
}
