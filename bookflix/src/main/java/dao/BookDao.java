//package dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//import domain.Book;
//import domain.UserMembership;
//import util.DBUtil;
//
//public class BookDao implements Dao<Book>{
//
//	@Override
//	public void insert(Book book) {
//		Connection connection = DBUtil.getConnection();
//		try {
//			PreparedStatement pstmt = connection.prepareStatement("insert into book(book_no,book_name,writer,publisher,total_pages,price) values (?, ?, ?, ?, ?, ?)");
//			pstmt.setString(1, null);
//			pstmt.setString(2, null);
//			pstmt.setString(3, null);
//			pstmt.setString(4, null);
//			pstmt.setString(5, null);
//			pstmt.setString(6, null);
//			
//			pstmt.executeQuery();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public Book selectOne(int no) {
//		Connection connection = DBUtil.getConnection();
//		try {
//			PreparedStatement pstmt = connection.prepareStatement("select * from book where book_no = ?");
//			pstmt.setInt(1, no);
//			
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				 Book book = Book.builder()
////													.userMembershipNo(rs.getInt("bookNo;"))
////													.memberNo(rs.getInt("member_no"))
////													.membershipNo(rs.getInt("membership_no"))
////												
////													.regDate(rs.getDate("regdate"))
////													.build();
//				
//				return book;
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//}
