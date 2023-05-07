package com.codingrecipe.member.controller;

import com.codingrecipe.member.dto.MemberDTO;
import com.codingrecipe.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Member;

@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;

    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }

    // @ModelAttribute
    @PostMapping("member/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        System.out.println("MemberController.save"); // soutm => 현재 메소드가 먼지를 출력함.
        System.out.println("memberDTO = " + memberDTO); // soutp => 매개변수를 출력문으로 만들어줌.
        memberService.save(memberDTO);
        return "login";
    }

    @GetMapping("member/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
        MemberDTO loginResult = memberService.login(memberDTO);
        if (loginResult != null) {
            //로그인 성공
            session.setAttribute("loginId",loginResult.getId());
            return "main";
        } else {
            // login 실패
            return"login";
        }
    }
}
