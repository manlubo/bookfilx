

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.ReadingHistory;
import util.DBUtil;

public class ReadingHistoryDao {

	public void insertReadingHistory() {
		
	}
	
	public ReadingHistory selectReadingHistory(int no) {
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
						.build();
				return readingHistory;
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;		
	}
}
