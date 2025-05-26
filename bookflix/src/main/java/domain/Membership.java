package domain;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Membership {
	
	int membershipNo; //멤버쉽 번호
	String membershipName; //멤버쉽 이름
	int price; //멤버쉽 가격
	int days; //멤버쉽 구독 기간

}
