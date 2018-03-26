package com.jftang3.auth.security;

import com.jftang3.auth.dto.ResponseDto;
import com.jftang3.auth.dto.StateDto;
import com.jftang3.auth.util.ResponseUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        ResponseUtil.setResponseContent(response, new ResponseDto(StateDto.SUCCESS, authentication));
    }
}
