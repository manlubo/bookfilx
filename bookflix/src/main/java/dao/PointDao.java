package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Point;
import util.DBUtil;

public class PointDao implements Dao<Point>{

    @Override
    public void insert(Point point) {
        Connection connection = DBUtil.getConnection();
        try { //redate빼고 3
            PreparedStatement pstmt = connection.prepareStatement("insert into member(point_no, member_no, amount) values (?, ?, ?)");
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
    public Point selectOne(int no) {
        Connection connection = DBUtil.getConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("select * from member where member_no = ?");
            pstmt.setInt(1, no);

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Point point = Point.builder()
                                .pointNo(rs.getInt("point_no"))
                                .memberNO(rs.getInt("member_no"))
                                .amount(rs.getInt("id"))
                                .regDate(rs.getDate("regdate"))
                                .build();
                return point;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}