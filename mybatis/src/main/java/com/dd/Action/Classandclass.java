package com.dd.Action;

import com.dd.Entity.School;
import com.dd.Entity.User;
import com.dd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Classandclass {

    @Autowired
    private UserService userService;


    @RequestMapping("/user")
    public  String  View(){

    User user=     userService.selectUserById(1);
        System.out.println(user.getUsername());
    return  "404";
    }



}
