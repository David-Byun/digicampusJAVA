package dao;

import dto.UserDTO;
import frame.DAO;

import java.util.*;

public class UserDAO implements DAO<String, UserDTO> {
    Map<String, UserDTO> db = null;

    public UserDAO() {
        db = new HashMap<>();
    }

    @Override
    public void insert(UserDTO userDTO) throws Exception {
        if (db.containsKey(userDTO.getId())) {
            throw new Exception("이미 아이디가 존재해요");
        }
        db.put(userDTO.getId(), userDTO);
    }

    @Override
    public void delete(String s) throws Exception {
        if (!db.containsKey(s)) {
            throw new Exception("아이디가 존재하지 않아요");
        }
        db.remove(s);
    }

    @Override
    public void update(UserDTO userDTO) throws Exception {
        if (!db.containsKey(userDTO.getId())) {
            throw new Exception("아이디가 존재하지 않아요");
        }
        db.put(userDTO.getId(), userDTO);
    }

    @Override
    public UserDTO select(String s) throws Exception {
        if (!db.containsKey(s)) {
            throw new Exception("아이디가 존재하지 않아요");
        }
        return db.get(s);
    }

    @Override
    public List<UserDTO> selectAll() throws Exception {
        ArrayList<UserDTO> list = new ArrayList<>();
        Collection<UserDTO> col = db.values();
        if (col.isEmpty()) {
            throw new Exception("유저가 존재하지 않아요");
        }
        for (UserDTO u : col) {
            list.add(u);
        }
        return list;
    }
}
