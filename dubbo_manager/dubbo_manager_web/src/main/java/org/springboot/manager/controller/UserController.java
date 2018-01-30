package org.springboot.manager.controller;

import org.springboot.manager.pojo.User;
import org.springboot.manager.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

@Controller
public class UserController {

    @Autowired
    private UserManagerService userManagerService;

    @RequestMapping("/login")
    @ResponseBody
    public User getUser(){

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入一个字符串：");
        //String print = scanner.nextLine();
        //System.out.println("用户输入了：" + print);

        return userManagerService.getUser();
    }

}
