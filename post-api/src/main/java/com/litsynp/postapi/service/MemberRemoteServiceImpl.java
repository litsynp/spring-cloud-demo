package com.litsynp.postapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MemberRemoteServiceImpl implements MemberRemoteService {

    private final RestTemplate restTemplate;

    @Override
    public String getMemberInfo(Long memberId) {
        return restTemplate.getForObject("http://localhost:8081/members/" + memberId, String.class);
    }
}
