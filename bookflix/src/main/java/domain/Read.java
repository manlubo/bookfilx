package domain;


import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("read")
public class Read {
	private Long rno; // 기록 번호
	private Long mno; // 회원 번호
	private Long bno; // 책 번호
	private int rpage; // 읽은 마지막 장
	private String moddate; // 마지막으로 읽은 날
}
