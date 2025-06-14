package domain;


import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Alias("book")
public class Book {
	
	private Long bno; // 책 번호
	private String name; // 책 제목
	private String writer;// 작가
	private String publisher; // 출판사
	private int pages; // 총 페이지
	private String regdate; // 등록일
	
}
