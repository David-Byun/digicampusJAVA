package bank.service;


import bank.DAO.UserDAO;
import bank.DTO.UserDTO;
import bank.frame.DAO;
import bank.frame.Service;

public class UserService implements Service<String, UserDTO> {

    DAO<String, UserDTO> dao;

    public UserService() {
        dao = new UserDAO();
    }

    @Override
    public void register(UserDTO userDTO) throws Exception {
        System.out.println("Security Check..");
        try {
            dao.insert(userDTO);
        } catch (Exception e) {
            throw e;
        }
        System.out.println("Send mail..");
        System.out.println("Send SMS..");
    }

    @Override
    public void remove(String s) throws Exception {
        System.out.println("Security Check..");
        dao.delete(s);
        System.out.println("Send mail..");
        System.out.println("Send SMS..");
    }

    @Override
    public void modify(UserDTO userDTO) throws Exception{
        System.out.println("Security Check..");
        dao.update(userDTO);
        System.out.println("Send mail..");
        System.out.println("Send SMS..");
    }
}