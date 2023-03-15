package jdbc;

import java.sql.*;

public class SelectTest {
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
        String selectSql = "select * from cust where id=?";
        System.out.println("접속 성공 !!");

        //Statement 생성 - SQL(해당 sql -> db 날리는 것)
        //SQL 전송
        //try 구문 안으로 들어가면, 자동으로 close 해줌
        try (Connection con = DriverManager.getConnection(url, id, pwd);
        PreparedStatement pstmt = con.prepareStatement(selectSql)){
            pstmt.setString(1, "id06");
            try (ResultSet rset = pstmt.executeQuery()) {
                rset.next();
                String db_id = rset.getString("id");
                String db_pwd = rset.getString("pwd");
                String name = rset.getString("name");
                int age = rset.getInt("age");
                System.out.println(db_id + " " + name + " " + age);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
