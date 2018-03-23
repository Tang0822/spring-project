package com.jftang3.auth.security;

import com.jftang3.auth.entity.MyGrantedAuthority;
import com.jftang3.auth.entity.MyUserDetails;
import com.jftang3.auth.entity.Permission;
import com.jftang3.auth.entity.User;
import com.jftang3.auth.service.PermissionService;
import com.jftang3.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.getUserByName(userName);
        if (user != null) {
            List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
            List<Permission> permissionList = permissionService.getPermissionByUserId(user.getId());
            for (Permission permission : permissionList) {
               grantedAuthorityList.add(new MyGrantedAuthority(permission.getMethod(), permission.getUrl()));
            }
            return new MyUserDetails(user.getId(), user.getGroupId(), user.getUsername(), user.getPassword(), true, grantedAuthorityList);
        } else {
            throw new UsernameNotFoundException(userName);
        }
    }
}
