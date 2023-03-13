package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {
    public static void main(String[] args) {
        //Driver Loading
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver가 없습니다.");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver Loading 성공!");

        //Connect
        String id = "bank";
        String pwd = "111111";
        String url = "jdbc:oracle:thin:@172.16.21.69:1521:XE";
        String updateSql = "update cust set pwd = ?, name = ?, age = ? where id = ?";
        System.out.println("접속 성공 !!");

        //Statement 생성 - SQL(해당 sql -> db 날리는 것)
        //SQL 전송
        try (Connection con = DriverManager.getConnection(url, id, pwd);
        PreparedStatement pstmt = con.prepareStatement(updateSql)){
            pstmt.setString(1, "변경패스");
            pstmt.setString(2, "변경네임");
            pstmt.setInt(3, 91);
            pstmt.setString(4, "id06");
            int result = pstmt.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
