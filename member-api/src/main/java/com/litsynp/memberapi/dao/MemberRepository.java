package com.litsynp.memberapi.dao;

import com.litsynp.memberapi.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
