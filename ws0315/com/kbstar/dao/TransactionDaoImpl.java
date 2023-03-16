package com.kbstar.dao;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TransactionDaoImpl implements DAO<String, TransactionDTO> {

    public TransactionDaoImpl() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver가 없습니다");
            e.printStackTrace();
        }
    }

    @Override
    public void insert(TransactionDTO trans) throws Exception {
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(Sql.TransInsertSql)) {
            pstmt.setString(1, trans.getAccNo());
            pstmt.setDouble(2, trans.getBalance());
            pstmt.setString(3, trans.getType());
            pstmt.setString(4, trans.getDesc());
            pstmt.setString(5, trans.getAccHolder());
            int result = pstmt.executeUpdate();
            System.out.println(result);
            if (result == 0) {
                throw new Exception("거래 등록이 실패했어요!");
            }
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String k) throws Exception {
        throw new Exception("삭제는 처리되지 않아요! 다른 거래를 해주세요");
    }

    @Override
    public void update(TransactionDTO trans) throws Exception {
        throw new Exception("거래내역은 업데이트 되지 않아요! 다른 거래를 해주세요");
    }

    @Override
    public TransactionDTO select(String k) throws Exception {
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(Sql.TransSelectSql)) {
            pstmt.setString(1, k);
            try (ResultSet rset = pstmt.executeQuery()) {
                rset.next();
                String date = rset.getString("tran_date");
                String accNo = rset.getString("acc_no");
                double balance = rset.getDouble("balance");
                String type = rset.getString("type");
                String desc = rset.getString("description");
                String accHolder = rset.getString("acc_holder");
                int result = pstmt.executeUpdate();
                if (result == 0) {
                    throw new Exception("거래내역을 찾지 못했습니다.");
                }
                return new TransactionDTO(date, accNo, balance, type, desc, accHolder);
            } catch (Exception e) {
                e.printStackTrace();
                throw new Exception("거래내역 찾기 실패!");
            }
        }
    }

    @Override
    public List<TransactionDTO> selectAll() throws Exception {
        System.out.println("전체 리스트는 조회할 수 없어요");
        return null;
    }

    @Override
    public List<TransactionDTO> search(String k) throws Exception {
        List<TransactionDTO> transList = new ArrayList<>();
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(Sql.myTransSelectAllSql)) {
            pstmt.setString(1, k);
            try (ResultSet rset = pstmt.executeQuery()) {
                while (rset.next()) {
                    String date = rset.getString("tran_date");
                    String accNo = rset.getString("acc_no");
                    double balance = rset.getDouble("balance");
                    String type = rset.getString("type");
                    String desc = rset.getString("description");
                    String accHolder = rset.getString("acc_holder");
                    transList.add(new TransactionDTO(date, accNo, balance, type, desc, accHolder));
                }
            } catch (Exception e) {
                throw new Exception("거래내역 찾기 실패!");
            }
            return transList;
        }
    }
}
