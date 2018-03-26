package com.jftang3.auth.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jftang3.auth.dto.ResponseDto;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtil {
    public static void setResponseContent(HttpServletResponse response, ResponseDto responseDto) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        String write = new ObjectMapper().writeValueAsString(responseDto);
        response.getWriter().write(write);
    }
}
