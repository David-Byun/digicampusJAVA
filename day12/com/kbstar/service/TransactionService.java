package com.kbstar.service;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

import java.util.List;

public class TransactionService implements CRUDService<String, TransactionDTO> {

    DAO<String, TransactionDTO> tranDao;
    Notification notification;

    public TransactionService() {
        tranDao = new TransactionDAO();
    }

    @Override
    public void register(TransactionDTO transactionDTO) throws Exception {
        try {
            tranDao.insert(transactionDTO);
        } catch (Exception e) {
            throw new Exception("거래내역 생성이 실패했어요. 정보를 다시 확인해주세요 (EX0001)");
        }
    }

    @Override
    public void remove(String k) throws Exception {
        try {
            tranDao.update(tranDao.select(k));
        } catch (Exception e) {
            throw new Exception("정상적으로 처리되지 않았어요.");
        }

    }

    @Override
    public void update(TransactionDTO transactionDTO) throws Exception {
        try {
            tranDao.update(transactionDTO);
        } catch (Exception e) {
            throw new Exception("거래내역이 업데이트가 되지 않았어요. 고객센터 문의해주세요 (EX0003)");
        }
    }


    @Override
    public TransactionDTO get(String k) throws Exception {
        try {
            TransactionDTO obj = tranDao.select(k);
            return obj;
        } catch (Exception e) {
            throw new Exception("거래내역을 찾지 못했어요. 고객센터 문의해주세요 (EX0004)");
        }

    }

    @Override
    public List<TransactionDTO> getAll() throws Exception {
        try {
            return tranDao.select();
        } catch (Exception e) {
            throw new Exception("거래내역 전체를 찾지 못했어요. 고객센터 문의해주세요 (EX0005)");
        }
    }

    @Override
    public void clear() throws Exception {
        tranDao.clear();
    }
}
