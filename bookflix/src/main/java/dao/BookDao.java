package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Book;
import domain.UserMembership;
import util.DBUtil;

public class BookDao implements Dao<Book>{

	@Override
	public void insert(Book book) {
		Connection connection = DBUtil.getConnection();
		try {//regdate 빼고 총 6개
			PreparedStatement pstmt = connection.prepareStatement("insert into book(book_no,book_name,writer,publisher,total_pages,price) values (?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, null);
			pstmt.setString(2, null);
			pstmt.setString(3, null);
			pstmt.setString(4, null);
			pstmt.setString(5, null);
			pstmt.setString(6, null);
			
			pstmt.executeQuery();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Book selectOne(int no) {
		Connection connection = DBUtil.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from book where book_no = ?");
			pstmt.setInt(1, no);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
//				 Book book = Book.builder() //builder() 오류 뜨는데 아무리 해도 안고쳐져서 일단 주석처리로 올렸습니다. 
//						 .bookNo(rs.getInt("book_no"))
//						 .bookName(rs.getString("book_name"))
//						 .writer(rs.getString("writer"))
//						 .publisher(rs.getString("publisher"))
//						 .totalPages(rs.getInt("total_pages"))
//						 .price(rs.getInt("price"))
//						 .regdate(rs.getDate("regdate"))
//						 .build();
//				
//				return book;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
