package com.zaver.dubbo.consumer.controller;

import com.zaver.dubbo.api.model.User;
import com.zaver.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : UserController
 * @Description TODO
 * @Date : 2019/4/8 13:35
 * @Author ABC
 * @Version 1.0
 * @Explanation ：
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public Object userList(){
        List<User> list = userService.list();
        return list;
    }
}
