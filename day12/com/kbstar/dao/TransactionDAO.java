package com.kbstar.dao;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

import java.util.*;

public class TransactionDAO implements DAO<String, TransactionDTO> {

    HashMap<String, TransactionDTO> db;

    public TransactionDAO() {
        db = new HashMap<>();
    }

    @Override
    public void insert(TransactionDTO transactionDTO) throws Exception {
        try {
            db.put(transactionDTO.getAccNo(), transactionDTO);
        } catch (Exception e) {
            throw new Exception("DB PUT ERROR!");
        }
    }

    @Override
    public void delete(String k) throws Exception {
        try {
            if (db.get(k) == null) {
                throw new Exception("DB NOT FOUND ERROR!");
            }
            db.remove(k);
        } catch (Exception e) {
            throw new Exception("DB DELETE ERROR!");
        }
    }

    @Override
    public void update(TransactionDTO transactionDTO) throws Exception {
        try {
            db.put(transactionDTO.getAccNo(), transactionDTO);
        } catch (Exception e) {
            throw new Exception("DB UPDATE ERROR!");
        }
    }

    @Override
    public TransactionDTO select(String k) throws Exception {
        try {
            if (db.get(k) == null) {
                throw new Exception("DB GET ERROR!");
            }
            return db.get(k);
        } catch (Exception e) {
            throw new Exception("DB GET ERROR!");
        }

    }
    @Override
    public List<TransactionDTO> select() throws Exception {
        try {
            Collection<TransactionDTO> values = db.values();
            if (values.isEmpty()) {
                throw new Exception("DB ALL GET ERROR");
            }
            return new ArrayList<>(values);
        } catch (Exception e) {
            throw new Exception("DB ALL GET ERROR");
        }

    }

    @Override
    public void clear() throws Exception {
        db.clear();
    }

    //고객이 보유하고 있는 계좌번호 입력하면 해당 계좌의 거래내역을 조회한다.
    @Override
    public List<TransactionDTO> search(Objects obj) throws Exception {
        return null;
    }
}
