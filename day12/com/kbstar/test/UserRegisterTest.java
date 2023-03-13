package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

import java.util.List;

public class UserRegisterTest {
    public static void main(String[] args) {
        CRUDService<String, UserDTO> service = new UserService();
        UserDTO obj = new UserDTO("id01", "pwd01", "james", "a@naver.com", "010-9999-0222");
        UserDTO obj2 = new UserDTO("id01", "pwd02", "james", "a@naver.com", "010-9999-0222");
        UserDTO obj3 = new UserDTO("id03", "pwd03", "james", "a@naver.com", "010-9999-0222");

        try {
            service.register(obj);
            service.register(obj2);
            service.register(obj3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // get(k) test ------------------------------------------------------
        UserDTO user = null;
        try {
            user = service.get("id01");
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // get test ------------------------------------------------------
        // List list = new ArrayList();

        List<UserDTO> list = null;
        try {
            list = service.get();
            for(UserDTO u:list) {
                System.out.println(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // remove() test ------------------------------------------------------
        try {
            service.remove("id04");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        //remove all test
        //update : 유저 객체가 다 들어오는 것(일부만 수정하는 개념이 아님)
}



