package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Alias("plan")
public class Plan {
	
	private int plno; // 멤버쉽 번호
	private String name; // 멤버쉽 이름
	private int price; // 멤버쉽 가격
	private int days; // 멤버쉽 구독 기간

}
