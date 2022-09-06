package kr.co.springboot.user.domain;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

    // 회원 PK
    private Integer userNo;

    // 회원 ID
    private String userId;

    // 회원 닉네임
    private String username;

    // 회원 비밀번호
    private String userPwd;



}
