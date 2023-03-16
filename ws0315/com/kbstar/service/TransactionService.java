package com.kbstar.service;

import com.kbstar.dao.TransactionDaoImpl;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

import java.util.List;

public class TransactionService implements CRUDService<String, TransactionDTO> {

    DAO<String, TransactionDTO> tranDao;

    public TransactionService() {
        tranDao = new TransactionDaoImpl();
    }

    @Override
    public void register(TransactionDTO tran) throws Exception {
        try {
            tranDao.insert(tran);
            System.out.println("거래내역 등록이 완료되었어요 " + tran.toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("거래내역 생성이 실패했어요. 정보를 다시 확인해주세요 (EX0001)");
        }
    }

    @Override
    public void remove(String k) throws Exception {
        System.out.println("놉!");
    }

    @Override
    public void modify(TransactionDTO tran) throws Exception {
        try {
            tranDao.update(tran);
            System.out.println("거래내역 업데이트가 완료 되었어요. " + tran.toString());
        } catch (Exception e) {
            throw new Exception("거래내역이 업데이트가 되지 않았어요. 고객센터 문의해주세요 (EX0003)");
        }
    }


    @Override
    public TransactionDTO get(String k) throws Exception {
        try {
            TransactionDTO obj = tranDao.select(k);
            System.out.println("거래 내역을 찾았어요 " + k.toString());
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("거래내역을 찾지 못했어요. 고객센터 문의해주세요 (EX0004)");
        }

    }

    @Override
    public List<TransactionDTO> search(String k) throws Exception {
        try {
            List<TransactionDTO> tranList = tranDao.search(k);
            System.out.println("거래 내역을 찾았어요" + tranList.toString());
            return tranList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("거래내역을 찾지 못했어요. 고객센터 문의해주세요 (EX0004)");
        }

    }

    @Override
    public List<TransactionDTO> getAll() throws Exception {
        throw new Exception("모든 사람의 거래내역은 볼 수 없어요!");
    }
}
