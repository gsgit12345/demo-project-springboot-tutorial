package com.example.controller.v1version;

import java.util.List;

import com.example.pojo.UserDto;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="userControllerV1")
@RequestMapping(value = "/userinfo", produces ="application/json")
public class UserController {

    public static final String X_ACCEPT_VERSION_V1 = "X-Accept-Version" + "=" + "v1";

    @Autowired
    private UserService userService;

    @GetMapping(value = "/alluser", headers = X_ACCEPT_VERSION_V1)
    public List<UserDto> getUserinfo() {
        List<UserDto> finalResults = userService.getAllUserInfo();
        return finalResults;
    }

}