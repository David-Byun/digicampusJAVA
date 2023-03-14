package com.kbstar.dao;

import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements DAO<String, String, Item> {

    public ItemDaoImpl() {
        // Driver Loading
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver가 없습니다.");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver Loading 성공.");
    }

    @Override
    public void insert(Item v) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemInsertSql)) {
            pstmt.setString(1, v.getId());
            pstmt.setString(2, v.getName());
            pstmt.setInt(3, v.getPrice());
            pstmt.setDouble(4, v.getRate());
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void delete(String k) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemDeleteSql);) {
            pstmt.setString(1, k);
            int result = pstmt.executeUpdate();
            if (result == 0) {
                throw new Exception("존재하지 않는 아이디입니다.");
            }
        } catch (Exception e1) {
            throw e1;
        }

    }

    @Override
    public void update(Item v) throws Exception {
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemUpdateSql);) {
            pstmt.setString(1, v.getName());
            pstmt.setInt(2, v.getPrice());
            pstmt.setDouble(3, v.getRate());
            pstmt.setString(4, v.getId());
            int result = pstmt.executeUpdate();
            if (result == 0) {
                throw new Exception("없음");
            }
        } catch (Exception e1) {
            throw e1;
        }
    }

    @Override
    public Item select(String k) throws Exception {
        Item item = null;
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemSelectSql);) {
            pstmt.setString(1, k);

            try (ResultSet rset = pstmt.executeQuery()) {
                rset.next();

                String id = rset.getString("id");
                String name = rset.getString("name");
                int price = rset.getInt("price");
                double rate = rset.getDouble("rate");
                Date regdate = rset.getDate("regdate");
                item = new Item(id, name, price, rate, regdate);
//				list.add(item);}
            } catch (Exception e) {
                throw e;
                // e.printStackTrace();
            }
        } catch (Exception e) {
            throw e; //
//			e.printStackTrace(); //네트워크 문제일때
        }
        return item;
    }

    @Override
    public List<Item> selectAll() throws Exception {
        List<Item> itemList = new ArrayList<>();
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemSelectAllSql)) {
            try (ResultSet rset = pstmt.executeQuery()) {
                while (rset.next()) {
                    String db_id = rset.getString("id");
                    String db_name = rset.getString("name");
                    int db_price = rset.getInt("price");
                    double db_rate = rset.getDouble("rate");
                    Date db_regdate = rset.getDate("regdate");
                    itemList.add(new Item(db_id, db_name, db_price, db_rate, db_regdate));
                }
                if (itemList.size() == 0) {
                    throw new Exception("DB 에러 : 리스트 미존재");
                }
            }
        } catch (Exception e) {
            throw new Exception("DB 에러 : 시스템 에러");
        }
        return itemList;
    }

    @Override
    public List<Item> search(String k) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}
