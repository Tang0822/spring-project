package com.jftang3.auth.security;

import com.jftang3.auth.dto.ResponseDto;
import com.jftang3.auth.dto.StateDto;
import com.jftang3.auth.util.ResponseUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler{

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        ResponseUtil.setResponseContent(response, new ResponseDto(StateDto.FORBIDDEN, exception));
    }
}
