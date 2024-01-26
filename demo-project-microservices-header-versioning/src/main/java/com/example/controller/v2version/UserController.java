package com.example.controller.v2version;

import com.example.pojo.UserDto;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value="userControllerV2")
@RequestMapping(value = "/userinfo", produces ="application/json")
public class UserController {
    public static final String X_ACCEPT_VERSION_V2 = "X-Accept-Version" + "=" + "v2";

    @Autowired
    private UserService userService;

    @GetMapping(value = "/alluser", headers = X_ACCEPT_VERSION_V2)
    public List<UserDto> getUserinfo() {
        List<UserDto> finalResults = userService.getAllUserInfo();
        return finalResults;
    }

    @GetMapping(value = "/message", headers = X_ACCEPT_VERSION_V2)
    public String greeting() {
        return userService.getGreeting();
    }

}