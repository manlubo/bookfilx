

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.ReadingHistory;
import util.DBUtil;

public class ReadingHistoryDao implements Dao<ReadingHistory>{

	@Override
	public void insert(ReadingHistory readingHistory) {
		Connection connection = DBUtil.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into readinghistory(member_no, book_no, last_page) values (?, ?, ?)");
			pstmt.setString(1, null); // member_no
			pstmt.setString(2, null); // book_no
			pstmt.setString(3, null); // last_page

			pstmt.executeQuery();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	@Override
	public ReadingHistory selectOne(int no) {
		Connection connection = DBUtil.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from readinghistory where history_no = ?");
			pstmt.setInt(1, no);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ReadingHistory readingHistory = ReadingHistory.builder()
						.historyNo(rs.getInt("readinghistory_history_no"))
						.memberNo(rs.getInt("readinghistory_member_no"))
						.bookNo(rs.getInt("readinghistory_book_no"))
						.lastPage(rs.getInt("readinghistory_last_page"))
						.updateDate(rs.getDate("readinghistort_update_date"))
						.build();
				return readingHistory;
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;		
	}
}
