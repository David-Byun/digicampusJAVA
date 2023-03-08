package bank.DAO;

import bank.frame.DAO;
import bank.DTO.UserDTO;

public class UserDAO implements DAO<String, UserDTO> {

    @Override
    public void insert(UserDTO userDTO) throws Exception {
        if(userDTO.getId().equals("id01")){
            throw new Exception("EX0004");
        }
        System.out.println(userDTO.getId() + "님이 저장되었습니다.");
    }

    @Override
    public void update(UserDTO userDTO) throws Exception{
        if(userDTO.getId().equals("id01")){
            throw new Exception("EX0006");
        }
        System.out.println(userDTO.getId() + "님이 수정되었습니다.");
    }

    @Override
    public void delete(String s) throws Exception{
        if(s.equals("id01")){
            throw new Exception("EX0005");
        }
        System.out.println(s + "님이 삭제 되었습니다.");
    }
}
