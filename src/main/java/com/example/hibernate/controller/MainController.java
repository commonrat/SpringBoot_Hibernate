package com.example.hibernate.controller;

import com.example.hibernate.pojo.User;
import com.example.hibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    @ResponseBody
    public List<User> sayHello(){
        List<User> list = userRepository.findAll();
        return list;
    }
}
