package com.litsynp.memberapi.api;

import com.litsynp.memberapi.domain.Member;
import com.litsynp.memberapi.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id) {
        return Member.builder()
                .id(id)
                .email("litsynp" + id + "@example.com")
                .password("1234")
                .build();
    }
}
