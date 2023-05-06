package com.codingrecipe.member.entity;

import com.codingrecipe.member.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//테이블 역할
@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
    @Id // pk 지정
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private String id;

    @Column(unique = true)
    private String pw;

    @Column
    private String name;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId());
        memberEntity.setPw(memberDTO.getPw());
        memberEntity.setName(memberDTO.getName());
        return memberEntity;
    }
}
