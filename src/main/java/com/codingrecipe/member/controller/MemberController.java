package com.codingrecipe.member.controller;

import com.codingrecipe.member.dto.MemberDTO;
import com.codingrecipe.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;

    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("member/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        System.out.println("MemberController.save"); // soutm => 현재 메소드가 먼지를 출력함.
        System.out.println("memberDTO = " + memberDTO); // soutp => 매개변수를 출력문으로 만들어줌.
        memberService.save(memberDTO);

        return "index";
    }
}
