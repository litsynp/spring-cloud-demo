package com.litsynp.postapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String memberInfo;

    private String title;

    @Lob
    private String content;

    @Builder
    public Post(Long id, String memberInfo, String title, String content) {
        this.id = id;
        this.memberInfo = memberInfo;
        this.title = title;
        this.content = content;
    }
}
