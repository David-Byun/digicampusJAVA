package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;
import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;

public class AccountCRUDServiceImpl implements CRUDService<String, AccountDTO> {

    DAO<String, AccountDTO> accDao;
    Notification notification;
    public AccountCRUDServiceImpl() {
        accDao = new AccountDAO();
    }
    @Override
    public void register(AccountDTO v) throws Exception {
        try {
            accDao.insert(v);
        } catch (Exception e) {
            if (e instanceof SQLIntegrityConstraintViolationException) {
                throw new Exception("계좌가 중복되었습니다.");
            } else {
                //throw new Exception("시스템 장애입니다.");
                e.printStackTrace();
            }
        }
    }

    @Override
    public void remove(String k) throws Exception {
        try {
            accDao.delete(k);
        } catch (Exception e) {
            if (e instanceof SQLRecoverableException) {
                throw new Exception("시스템 장애입니다.");
            } else {
                throw new Exception("해당 계좌가 존재하지 않습니다.");
            }
        }
    }

    @Override
    public void modify(AccountDTO v) throws Exception {
        try {
            accDao.update(v);
        } catch (Exception e) {
            if(e instanceof SQLRecoverableException) {
                throw new Exception("시스템 장애");
            } else {
                throw new Exception("해당 계좌가 존재하지 않습니다.");
//				e.getStackTrace();
            }
        }
    }

    @Override
    public AccountDTO get(String k) throws Exception {
        AccountDTO user = null;
        try {
            user = accDao.select(k);
        } catch (Exception e) {
            if(e instanceof SQLRecoverableException ) {
                throw new Exception("시스템 장애입니다.");
            }else {
                throw new Exception("아이디가 존재하지 않습니다.");
            }
        }
        return user;
    }

    @Override
    public List<AccountDTO> getAll() throws Exception {
        List<AccountDTO> list = null;
        try {
            list = accDao.selectAll();
        } catch (Exception e) {
            if(e instanceof SQLRecoverableException) {
                throw new Exception("시스템 장애입니다.");
            }else {
                throw new Exception("계좌가 존재하지 않습니다.");
            }
        }
        return list;
    }

}
