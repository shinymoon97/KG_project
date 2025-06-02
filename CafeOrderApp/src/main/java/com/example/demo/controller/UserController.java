package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "index"; // index.html 로 이동
    }
    
    @GetMapping("/form")
    public String form() {
        return "form"; // templates/form.html 로 이동
    }

    @PostMapping("/submit")
    public String submit(User user) {
        userRepository.save(user);
        return "result"; // templates/result.html 로 이동
    }
}
