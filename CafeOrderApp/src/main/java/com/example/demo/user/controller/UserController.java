package com.example.demo.user.controller;

import com.example.demo.user.entity.UserForm;
import com.example.demo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    
    @GetMapping("/")
    public String index() {
        return "index"; // templates/index.html 로 이동
    }
    
    @GetMapping("/register")
    public String register() {
        return "register"; // templates/register.html 로 이동
    }
    
    @PostMapping("/register")
    public String register(@ModelAttribute UserForm user) {
        userService.save(user);  // DB에 저장
        return "redirect:/success";  // 회원가입 성공 후 이동할 경로
    }
    
    @PostMapping("/success")
    public String success() {
        return "success"; // templates/success.html 로 이동
    }
    
    @GetMapping("/login")
    public String login() {
        return "login"; // templates/login.html 로 이동
    }
    
    @PostMapping("/login")
    public String login(@ModelAttribute UserForm user) {
        // userService.save(user);  // DB에 저장
        return "redirect:/welcome";  // 로그인 성공 후 이동할 경로
    }
    
    @PostMapping("/welcome")
    public String welcome() {
        return "welcome"; // templates/welcome.html 로 이동
    }
}