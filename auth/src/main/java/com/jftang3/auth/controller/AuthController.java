package com.jftang3.auth.controller;

import com.jftang3.auth.dto.ResponseDto;
import com.jftang3.auth.dto.StateDto;
import com.jftang3.auth.entity.User;
import com.jftang3.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthController {

    private final UserService userService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public AuthController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @RequestMapping("/home")
    public ResponseDto home() {
        List<User> users = userService.getAllUser();
        return new ResponseDto(StateDto.SUCCESS, users);
    }

    @GetMapping("/login")
    public ResponseDto login() {
        return new ResponseDto(StateDto.UNAUTHORIZED, "未登录");
    }

    @PostMapping("/saveUser")
    public ResponseDto saveUser(@RequestBody User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        if (userService.saveUser(user) == 1) {
            return new ResponseDto(StateDto.SUCCESS, "请求成功");
        } else {
            return new ResponseDto(StateDto.WRONG, "请求失败");
        }

    }

    @PostMapping("/updateUser")
    public ResponseDto updateUser(@RequestBody User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        if (userService.updateUser(user) == 1) {
            return new ResponseDto(StateDto.SUCCESS, "请求成功");
        } else {
            return new ResponseDto(StateDto.WRONG, "请求失败");
        }
    }
}
