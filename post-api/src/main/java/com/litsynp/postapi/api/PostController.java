package com.litsynp.postapi.api;

import com.litsynp.postapi.domain.Post;
import com.litsynp.postapi.service.MemberRemoteService;
import com.litsynp.postapi.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final MemberRemoteService memberRemoteService;

    @GetMapping("/{id}")
    public Post getPost(@PathVariable long id) {
        String memberInfo = memberRemoteService.getMemberInfo(11111L);
        return Post.builder()
                .id(id)
                .memberInfo(memberInfo)
                .title("Test title")
                .content("Test content")
                .build();
    }
}
