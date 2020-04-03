package com.hg.systemGd.issm.controller;

import com.hg.systemGd.issm.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
private UserService userService;

    @RequestMapping("/hello")
    public @ResponseBody  Object getUser()throws Exception{

     return userService.saveUser();
    }
}
