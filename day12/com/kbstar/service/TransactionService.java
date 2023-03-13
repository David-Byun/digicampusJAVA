package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class TransactionService implements CRUDService<String, TransactionDTO>{

    DAO<String, TransactionDTO> transactionDao;

    public TransactionService() {
        transactionDao = new TransactionDAO();
    }

    @Override
    public void register(TransactionDTO v) throws Exception {
        transactionDao.insert(v);

    }

    @Override
    public void remove(String k) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void modify(TransactionDTO v) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public TransactionDTO get(String k) throws Exception {
        TransactionDTO obj = null;
        obj = transactionDao.select(k);
        return obj;
    }

    @Override
    public List<TransactionDTO> get() throws Exception {
        List<TransactionDTO> list = null;
        try {
            list = transactionDao.select();
        } catch (Exception e) {
            throw new Exception("조회오류");
        }
        return list;
    }

}
