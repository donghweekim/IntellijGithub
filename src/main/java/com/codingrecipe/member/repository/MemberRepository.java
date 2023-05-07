package com.codingrecipe.member.repository;

import com.codingrecipe.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    // <본인이 필요한 entity, pk의 타입>
    // 아이디로 회원 정보 조회 (select * from member_table where id=?)
    Optional<MemberEntity> findById(String id);
}
