package com.example.apiservice.controller;

import com.example.apiservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2019/7/17
 */

@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public void getUserList() {
        logger.info("start query----------------------------------------");
        userService.getAllUsers();
        logger.info("end query------------------------------------------");
    }

}
