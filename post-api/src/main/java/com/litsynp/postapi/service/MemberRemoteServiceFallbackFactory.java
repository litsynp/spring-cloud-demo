package com.litsynp.postapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MemberRemoteServiceFallbackFactory implements FallbackFactory<MemberRemoteService> {

    @Override
    public MemberRemoteService create(Throwable cause) {
        log.error(cause.toString());
        return memberId -> "MemberId not found";
    }
}
