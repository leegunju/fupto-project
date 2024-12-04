package com.fupto.back.anonymous.board.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDto {

    private Long id;
    private String title;
    private String contents;
    private String img;
    private Long regMemberId;
    private String regMemberNickName;
    private Instant createdAt;
    private Instant modifiedAt;
    private Long boardCategoryId;
    private String boardCategoryName;
    private Boolean active;

}