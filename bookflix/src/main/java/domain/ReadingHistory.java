package domain;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadingHistory {
	
	private int historyNo, memberNo, bookNo, lastPage;	
	private Date update_date;
	
}
