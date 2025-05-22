package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.UserMembership;
import util.DBUtil;

public class UserMembershipDao implements Dao<UserMembership>{

	@Override
	public void insert(UserMembership userMembership) {
		Connection connection = DBUtil.getConeection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into usermembership(member_no, membership_no,end_date) values (?, ?, ?)");
			pstmt.setString(1, null);
			pstmt.setString(2, null);
			pstmt.setString(3, null);
			
			pstmt.executeQuery();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public UserMembership selectOne(int no) {
		Connection connection = DBUtil.getConeection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from usermembership where member_no = ?");
			pstmt.setInt(1, no);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				UserMembership userMembership = UserMembership.builder()
													.userMembershipNo(rs.getInt("member_membership_no"))
													.memberNo(rs.getInt("member_no"))
													.membershipNo(rs.getInt("membership_no"))
													.startDate(rs.getDate("start_date"))
													.endDate(rs.getDate("end_date"))
													.build();
				return userMembership;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
