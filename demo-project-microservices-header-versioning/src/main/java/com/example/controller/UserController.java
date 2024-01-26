package com.example.controller;

import com.example.pojo.UserDto;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/userInfo",produces = "application/json")
public class UserController {
    @Autowired
    public UserService userService;
    @GetMapping(value="/allUser")
    public List<UserDto> getAllUser()
    {
        List<UserDto> userInfo=userService.getAllUserInfo();
        return userInfo;
    }
}
