package com.jftang3.auth.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
public class MyGrantedAuthority implements GrantedAuthority {

    private String url;

    private String method;

    @Override
    public String getAuthority() {
        return this.url + ";" + this.method;
    }

    public MyGrantedAuthority(String url, String method) {
        this.method = method;
        this.url = url;
    }
}
