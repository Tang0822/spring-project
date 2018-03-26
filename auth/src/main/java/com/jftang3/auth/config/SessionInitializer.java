package com.jftang3.auth.config;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class SessionInitializer extends AbstractHttpSessionApplicationInitializer {
    public SessionInitializer() {
        super(SecurityConfig.class, SessionConfig.class);
    }
}
