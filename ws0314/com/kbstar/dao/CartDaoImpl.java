package com.kbstar.dao;

import com.kbstar.dto.Cart;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartDaoImpl implements DAO<String, String, Cart> {

    public CartDaoImpl() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver가 없습니다");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver Loading 성공!");
    }

    @Override
    public void insert(Cart cart) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartinsertSql)) {
            pstmt.setString(1, cart.getId());
            pstmt.setString(2, cart.getUserId());
            pstmt.setString(3, cart.getItemId());
            pstmt.setInt(4, cart.getCnt());
            int result = pstmt.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
            throw e;
        }
    }

    @Override
    public void delete(String k) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt
                = con.prepareStatement(Sql.cartdeletSql)) {
            pstmt.setString(1, k);
            int result = pstmt.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void update(Cart cart) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartupdateSql)) {
            pstmt.setString(4, cart.getId());
            pstmt.setString(1, cart.getUserId());
            pstmt.setString(2, cart.getItemId());
            pstmt.setInt(3, cart.getCnt());
            int result = pstmt.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            throw e;
        }

    }

    @Override
    public Cart select(String k) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartselectSql)) {
            pstmt.setString(1, k);
            try (ResultSet rset = pstmt.executeQuery()) {
                rset.next();
                String id = rset.getString("id");
                String userId = rset.getString("user_id");
                String itemId = rset.getString("item_id");
                int cnt = rset.getInt("cnt");
                Date regdate = rset.getDate("regdate");
                int result = pstmt.executeUpdate();
                if (result == 0) {
                    throw new Exception("요청하신 카트정보를 찾을 수 없어요");
                }
                return new Cart(id, userId, itemId, cnt, regdate);
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Cart> selectAll() throws Exception {
        List<Cart> cartList = new ArrayList<>();
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectAllSql)) {
            try (ResultSet rset = pstmt.executeQuery()) {
                while (rset.next()) {
                    String id = rset.getString("id");
                    String userId = rset.getString("user_id");
                    String itemId = rset.getString("item_id");
                    int cnt = rset.getInt("cnt");
                    Date regdate = rset.getDate("regdate");
                    cartList.add(new Cart(id, userId, itemId, cnt, regdate));
                }
                if (cartList.size() == 0) {
                    throw new Exception("카트가 비어있어요!");
                }
            }
        } catch (SQLException e) {
            throw e;
        }
        return cartList;
    }

    @Override
    public List<Cart> search(String k) throws Exception {
        return null;
    }
}
