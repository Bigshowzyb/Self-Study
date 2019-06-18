package com.example.apiservice.controller;

import com.example.apiservice.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youbo
 * @date 2019/6/18
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    public void getUser(@RequestBody User user) {
        System.out.println();
    }
}
