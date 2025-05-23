package domain;

import java.sql.Date;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Book {
	
	int bookNo; //회원
	int totalPages; // 총페이지
	int price; //가격
	String bookName; //책 제목
	String writer;//작가
	String publisher; //출판사
	Date regdate;
	


}
