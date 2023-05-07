package com.codingrecipe.member.dto;

import com.codingrecipe.member.entity.MemberEntity;
import lombok.*;

// 필드 값이 선언되면 자동으로 아래의 이름에 맞는 메소드를 만들어줌
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private String id;
    private String pw;
    private String name;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setPw(memberEntity.getPw());
        memberDTO.setName(memberDTO.getName());
        return memberDTO;
    }
}
