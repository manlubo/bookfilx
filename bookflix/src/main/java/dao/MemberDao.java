package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Member;
import util.DBUtil;

public class MemberDao implements Dao<Member>{

    @Override
    public void insert(Member member) {
        Connection connection = DBUtil.getConnection();
        try { //regdate빼고 6
            PreparedStatement pstmt = connection.prepareStatement("insert into member(member_no, id, pw, name, tel, email) values (?, ?, ?, ?, ?, ?, ?)");
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
    public Member selectOne(int no) {
        Connection connection = DBUtil.getConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("select * from member where member_no = ?");
            pstmt.setInt(1, no);

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Member member = Member.builder()
                                .memberNo(rs.getInt("member_no"))
                                .id(rs.getString("id"))
                                .pw(rs.getString("pw"))
                                .name(rs.getString("name"))
                                .tel(rs.getString("tel"))
                                .email(rs.getString("email"))
                                .regDate(rs.getDate("regdate"))
                                .build();
                return member;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}