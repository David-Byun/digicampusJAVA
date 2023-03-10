package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

import java.util.List;

public class UserService implements CRUDService<String, UserDTO> {

    DAO<String, UserDTO> userDao;
    Notification notification;

    public UserService() {
        userDao = new UserDAO();
        notification = new NotificationImpl();
    }

    @Override
    public void register(UserDTO userDTO) throws Exception {

        /** 비밀번호 암호화
         * db에서 db error 내보내면 서비스에서 catch해서 받아줌
         * 사용자 친화적인 문구로 다듬에서 앱으로 보내줌
         * db단에서 보내주는 에러문구를 앱에서 그대로 보여주는게 아니고 변환 필요
         * (해킹등의 위험 발생)
         */


        try {
            userDao.insert(userDTO);
        } catch (Exception e) {
            throw new Exception("회원가입이 실패하였습니다.(EX0001)");
        }
        notification.sendEmail(userDTO.getEmail(), Msg.registerMsg1);
        notification.sendSMS(userDTO.getContact(), Msg.registerMsg2);
    }

    @Override
    public void remove(String s) throws Exception {
        UserDTO user = userDao.select(s);
        try {
            userDao.delete(s);
        } catch (Exception e) {
            throw new Exception(("탈퇴 처리가 정상적으로 처리되었습니다."));
        }

        notification.sendSMS(user.getContact(), Msg.removeMsg1);
        notification.sendEmail(user.getEmail(), Msg.removeMsg2);
    }

    @Override
    public void update(UserDTO userDTO) throws Exception {
        try {
            userDao.update(userDTO);
        } catch (Exception e) {
            throw new Exception("수정 오류입니다.");
        }
    }

    @Override
    public UserDTO get(String k) throws Exception {
        return userDao.select(k);
    }

    @Override
    public List<UserDTO> getAll() throws Exception {
        try {
            return userDao.select();
        } catch (Exception e) {
            throw new Exception("조회 오류");
        }
    }

    @Override
    public void clear() throws Exception {
        userDao.clear();
    }
}
