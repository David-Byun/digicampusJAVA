package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class UserDaoImpl implements DAO<String, UserDTO> {

    public UserDaoImpl() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver가 없습니다.");
            e.printStackTrace();
        }
    }

    @Override
    public void insert(UserDTO v) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
            pstmt.setString(1, v.getId());
            pstmt.setString(2, v.getPwd());
            pstmt.setString(3, v.getName());
            pstmt.setString(4, v.getEmail());
            pstmt.setString(5, v.getContact());
            int result = pstmt.executeUpdate();
            if (result == 0) {
                throw new Exception("이미 존재하는 아이디입니다.");
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void delete(String k) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
            pstmt.setString(1, k);
            int result = pstmt.executeUpdate();
            if (result == 0) {
                throw new Exception("존재하지 않는 아이디입니다.");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void update(UserDTO v) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql)) {
            pstmt.setString(1, v.getPwd());
            pstmt.setString(2, v.getName());
            pstmt.setString(3, v.getEmail());
            pstmt.setString(4, v.getContact());
            pstmt.setString(5, v.getId());
            int result = pstmt.executeUpdate();
            if (result == 0) {
                throw new Exception("존재하지 않는 정보입니다.");
            }
        } catch (Exception e1) {
            throw e1;
        }
    }

    @Override
    public UserDTO select(String k) throws Exception {
        UserDTO user = null;
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql)) {
            // try 옆 괄호 안의 자원들은 try catch문이 끝나면 자동으로 close된다 = try with resource
            pstmt.setString(1, k);

            try (ResultSet rset = pstmt.executeQuery()) {
                rset.next();
                String id = rset.getString("id"); // id라는 칼럼명을 가져오겠다~
                String pwd = rset.getString("pwd");
                String name = rset.getString("name");
                String email = rset.getString("email");
                String contact = rset.getString("contact");

                user = new UserDTO(id, pwd, name, email, contact);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        }
        return user;
    }

    @Override
    public List<UserDTO> selectAll() throws Exception {
        List<UserDTO> list = new ArrayList<>();
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql)) {
            try (ResultSet rset = pstmt.executeQuery();) {
                while (rset.next()) {
                    UserDTO user = null;
                    String id = rset.getString("id"); // id라는 칼럼명을 가져오겠다~
                    String pwd = rset.getString("pwd");
                    String name = rset.getString("name");
                    String email = rset.getString("email");
                    String contact = rset.getString("contact");
                    user = new UserDTO(id, pwd, name, email, contact);
                    list.add(user);
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        }
        return list;
    }
}
