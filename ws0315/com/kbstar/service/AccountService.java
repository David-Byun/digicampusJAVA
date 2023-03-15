package com.kbstar.service;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

import java.util.List;

public class AccountService implements CRUDService<String, AccountDTO> {

    DAO<String, AccountDTO> accDao;
    Notification notification;

    public AccountService() {
        accDao = new AccountDAO();
        notification = new NotificationImpl();
    }

    @Override
    public void register(AccountDTO accountDTO) throws Exception {
        try {
            accDao.insert(accountDTO);
        } catch (Exception e) {
            throw new Exception("계좌 개설이 실패했어요. 정보를 다시 확인해주세요 (EX0001)");
        }
    }

    @Override
    public void remove(String k) throws Exception {
        try {
            accDao.delete(k);
        } catch (Exception e) {
            throw new Exception("삭제가 실패했어요. 다시 시도해주세요 (EX0002)");
        }

    }

    @Override
    public void modify(AccountDTO accountDTO) throws Exception {
        try {
            accDao.update(accountDTO);

        } catch (Exception e) {
            throw new Exception("업데이트가 되지 않았어요. 고객센터 문의해주세요 (EX0003)");
        }
    }


    @Override
    public AccountDTO get(String k) throws Exception {
        try {
            AccountDTO obj = null;
            obj = accDao.select(k);
            return obj;
        } catch (Exception e) {
            throw new Exception("계좌 정보를 찾지 못했어요. 고객센터 문의해주세요 (EX0004)");
        }

    }

    @Override
    public List<AccountDTO> getAll() throws Exception {
        try {
            return accDao.selectAll();
        } catch (Exception e) {
            throw new Exception("계좌 전체를 찾지 못했어요. 고객센터 문의해주세요 (EX0005)");
        }
    }


}
