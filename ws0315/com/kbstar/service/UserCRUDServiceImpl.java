package com.kbstar.service;
import com.kbstar.dao.UserDaoImpl;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;


public class UserCRUDServiceImpl implements CRUDService<String, UserDTO> {

    DAO<String, UserDTO> dao;
    Notification noti;

    public UserCRUDServiceImpl() {
        dao = new UserDaoImpl();
        noti = new NotificationImpl();
    }

    @Override
    public void register(UserDTO v) throws Exception {
        try {
            dao.insert(v);
            noti.sendEmail(v.getEmail(), Msg.registerMsg1);
            noti.sendSMS(v.getContact(), Msg.registerMsg2);
        } catch (Exception e) {
            if (e instanceof SQLIntegrityConstraintViolationException) {
                throw new Exception("ID가 중복되었습니다.");
            } else {
                //throw new Exception("시스템 장애입니다.");
                e.printStackTrace();
            }
        }
    }

    @Override
    public void remove(String k) throws Exception {
        UserDTO user = null;
        try {
            user = dao.select(k);
            dao.delete(k);
            noti.sendEmail(user.getEmail(), Msg.removeMsg1);
            noti.sendSMS(user.getContact(), Msg.removeMsg2);
        } catch (Exception e) {
            if (e instanceof SQLRecoverableException) {
                throw new Exception("시스템 장애입니다.");
            } else {
                throw new Exception("해당 ID가 존재하지 않습니다.");
            }
        }
    }

    @Override
    public void modify(UserDTO v) throws Exception {
        try {
            dao.update(v);
        } catch (Exception e) {
            if(e instanceof SQLRecoverableException) {
                throw new Exception("시스템 장애");
            } else {
                throw new Exception("해당 ID가 존재하지 않습니다.");
//				e.getStackTrace();
            }
        }

    }

    @Override
    public UserDTO get(String k) throws Exception {
        UserDTO user = null;
        try {
            user = dao.select(k);
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
    public List<UserDTO> getAll() throws Exception {
        List<UserDTO> list = null;
        try {
            list = dao.selectAll();
        } catch (Exception e) {
            if(e instanceof SQLRecoverableException) {
                throw new Exception("시스템 장애입니다.");
            }else {
                throw new Exception("아이디가 존재하지 않습니다.");
            }
        }
        return list;
    }

}