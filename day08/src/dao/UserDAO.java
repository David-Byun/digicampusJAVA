package dao;


import dto.UserDTO;
import frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

    @Override
    public void insert(UserDTO userDTO) {
        System.out.println(userDTO.getId() + "님이 저장되었습니다.");
    }

    @Override
    public void update(UserDTO userDTO) {
        System.out.println(userDTO.getId() + "님이 수정되었습니다.");
    }

    @Override
    public void delete(String s) {
        System.out.println(s + "님이 삭제 되었습니다.");
    }
}
