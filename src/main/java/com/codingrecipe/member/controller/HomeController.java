package com.codingrecipe.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본페이지 출력 요청
    @GetMapping("/")
    public String index() {
        return "index"; // => templates 의 index.html 을 출력
    }
}
