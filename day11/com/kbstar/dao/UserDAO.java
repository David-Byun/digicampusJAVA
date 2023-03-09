package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class UserDAO implements DAO<String, UserDTO> {

    HashMap<String, UserDTO> db;

    public UserDAO() {
        db = new HashMap<>();
    }

    // 실제 db 존재시 db에서 처리해주기 때문에 if 절등 필요 없음
    @Override
    public void insert(UserDTO userDTO) throws Exception {
        db.put(userDTO.getId(), userDTO);
        if(userDTO.getId().equals("id02")){
            throw new Exception("DB Error");
        }
        System.out.println(userDTO.getId() + "님이 저장되었습니다.");

    }

    @Override
    public void update(UserDTO userDTO) throws Exception{
        if(userDTO.getId().equals("id10")){
            throw new Exception("EX0006");
        }
        System.out.println(userDTO.getId() + "님이 수정되었습니다.");
    }

    @Override
    public void delete(String s) throws Exception{
        if(s.equals("id11")){
            throw new Exception("EX0005");
        }
        System.out.println(s + "님이 삭제 되었습니다.");
    }


    @Override
    public UserDTO select(String k) throws Exception {
        return db.get(k);
    }

    @Override
    public List<UserDTO> select() throws Exception {
        ArrayList<UserDTO> list = new ArrayList<>();
        Collection<UserDTO> col = db.values();

        for(UserDTO obj: col){
            list.add(obj);
            System.out.println(obj);
        };
        return list;
    }

    @Override
    public void clear() throws Exception {
        db.clear();
    }


}
