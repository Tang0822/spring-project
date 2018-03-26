package com.jftang3.auth.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter
@Setter
public class MyUserDetails implements UserDetails {

    private static final long serialVersionUID = -1353113427070911386L;

    private Integer userId;

    private Integer groupId;

    private String username;

    private String password;

    private boolean enabled;

    private String token;

    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public MyUserDetails(Integer userId, Integer groupId, String username, String password, boolean enabled,
                         Collection<? extends GrantedAuthority> authorities) {
        super();
        this.userId = userId;
        this.groupId = groupId;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authorities = authorities;
    }
}
