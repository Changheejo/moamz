package com.example.moamz.domain.dto.community.sharing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class SharingWriteDTO {
    //
    // 나눔게시판 글 작성 DTO
    //

    private Long userCode;          // 유저CODE
    private Long postId;            // 게시글ID
    private String postTitle;       // 나눔글 제목
    private String sharingContent;  // 나눔글 내용

    private Long postFileId;        // 파일ID
    private String postFileName;    // 파일명
    private String postFileRoot;    // 파일경로
    private String postFileUuid;    // 파일UUID

}
