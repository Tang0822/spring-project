package com.jftang3.auth.service.impl;

import com.jftang3.auth.dao.PermissionDao;
import com.jftang3.auth.entity.Permission;
import com.jftang3.auth.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    private final PermissionDao permissionDao;

    @Autowired
    public PermissionServiceImpl(PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    @Override
    public List<Permission> getPermissionByUserId(Integer id) {
        return permissionDao.getPermissionByUserId(id);
    }
}
