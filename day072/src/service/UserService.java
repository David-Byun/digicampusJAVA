package service;

import dao.UserDAO;
import dto.UserDTO;
import frame.DAO;
import frame.Service;

public class UserService implements Service<String, UserDTO> {

    DAO<String, UserDTO> dao;

    public UserService() {
        dao = new UserDAO();
    }

    @Override
    public void register(UserDTO userDTO) {
        System.out.println("Security Check..");
        dao.insert(userDTO);
        System.out.println("Send mail..");
        System.out.println("Send SMS..");
    }

    @Override
    public void remove(String s) {
        dao.delete(s);
        System.out.println("Send mail..");
    }

    @Override
    public void modify(UserDTO userDTO) {
        dao.update(userDTO);
        System.out.println("Send mail..");
    }
}
