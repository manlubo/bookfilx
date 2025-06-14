package domain;


import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("sub")
public class Sub {
	private Long sno; // 멤버십 구독 번호
	private Long mno; // 유저 번호
	private Long plno; // 멤버십 번호
	private String startDate; // 멤버십 시작 날짜
	private String endDate; // 멤버십 종료 날짜
}
