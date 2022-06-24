package com.litsynp.postapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "member-service")
public interface MemberRemoteService {

    @GetMapping("/members/{memberId}")
    String getMemberInfo(@PathVariable Long memberId);
}
