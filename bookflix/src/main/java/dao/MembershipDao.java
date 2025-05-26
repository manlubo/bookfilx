package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Membership;
import util.DBUtil;

public class MembershipDao implements Dao<Membership>{

    @Override
    public void insert(Membership membership) {
        Connection connection = DBUtil.getConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("insert into membership(membership_name, price, days) values (?, ?, ?)");
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
    public Membership selectOne(int no) {
        Connection connection = DBUtil.getConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("select * from membership where membership_no = ?");
            pstmt.setInt(1, no);

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Membership membership = Membership.builder()
					                    .membershipNo(rs.getInt("membership_no"))
					                    .membershipName(rs.getString("membership_name"))
					                    .price(rs.getInt("price"))
					                    .days(rs.getInt("days"))
					                    .build();
                return membership;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}