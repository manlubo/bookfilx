package domain;


import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("member")
public class Member {

    private Long mno; // 회원번호
    private String id; // 아이디
    private String pw; // 비밀번호
    private String name; // 이름
    private String tel; // 전화번호
    private String email; // 이메일
    private String regdate; // 등록일
}
