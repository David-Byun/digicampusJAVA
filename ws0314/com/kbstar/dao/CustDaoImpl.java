package com.kbstar.dao;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.kbstar.frame.Sql.*;

public class CustDaoImpl implements DAO<String, String, Cust> {

    public CustDaoImpl() {
        //Driver Loading
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver가 없습니다.");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver Loading 성공!");
    }


    @Override
    public void insert(Cust v) throws Exception {
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(insertSql);){
            pstmt.setString(1, v.getId());
            pstmt.setString(2, v.getPwd());
            pstmt.setString(3, v.getName());
            pstmt.setInt(4, v.getAge());
            int result = pstmt.executeUpdate();
            System.out.println(result);
            if (result == 0) {
                throw new Exception("cart 등록이 정상적으로 처리되지 않았어요");
            }
        } catch (SQLException e) {
            throw e;
            //e.printStackTrace();
        }
    }

    @Override
    public void delete(String k) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(deleteSql)) {
            pstmt.setString(1, k);
            int result = pstmt.executeUpdate();
            System.out.println(result);
            if (result == 0) {
                throw new Exception("DB : 삭제 실패");
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void update(Cust v) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(updateSql)) {
            pstmt.setString(1, v.getPwd());
            pstmt.setString(2, v.getName());
            pstmt.setInt(3, v.getAge());
            pstmt.setString(4, v.getId());
            int result = pstmt.executeUpdate();
            System.out.println(result);
            if (result == 0) {
                throw new Exception("업데이트 오류");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Cust select(String k) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(selectSql)) {
            pstmt.setString(1, k);
            String db_id;
            String db_pwd;
            String name;
            int age;
            try (ResultSet rset = pstmt.executeQuery()) {
                rset.next();
                db_id = rset.getString("id");
                db_pwd = rset.getString("pwd");
                name = rset.getString("name");
                age = rset.getInt("age");
                int result = pstmt.executeUpdate();
                if (result == 0) {
                    throw new Exception("조회 오류");
                }
                return new Cust(db_id, db_pwd, name, age);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Cust> selectAll() throws Exception {
        List<Cust> custList = new ArrayList<>();
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(selectAllSql)) {
            try (ResultSet rset = pstmt.executeQuery()) {
                while (rset.next()) {
                    String db_id = rset.getString("id");
                    String db_pwd = rset.getString("pwd");
                    String name = rset.getString("name");
                    int age = rset.getInt("age");
                    custList.add(new Cust(db_id, db_pwd, name, age));
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return custList;
    }

    @Override
    public List<Cust> search(String k) throws Exception {
        return null;
    }
}
