package domain;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadingHistory {
	
	// 읽은기록, 회원번호, 책번호, 마지막장
	private int historyNo, memberNo, bookNo, lastPage;	
	private Date updateDate;
	
}
