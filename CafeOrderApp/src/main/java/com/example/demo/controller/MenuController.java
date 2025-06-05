package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/menuList")
    public String menuListPage() {
        return "menuList";  // templates/menuList.html
    }

    @GetMapping("/cafeInfo")
    public String cafeInfoPage() {
        return "cafeInfo";  // templates/cafeInfo.html
    }
}