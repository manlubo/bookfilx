package domain;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {

    private int memberNo; //회원번호
    private String id; // 아이디
    private String pw; //비밀번호
    private String name; //책 제목
    private String tel; //전화번호
    private String email; //이메일
    private Date regDate;
}
