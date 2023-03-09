package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

import java.util.List;

public class UserRegisterTest {
    public static void main(String[] args) {
        CRUDService<String, UserDTO> service = new UserService();

        //register test
        UserDTO obj = new UserDTO("id01", "pwd01", "james1", "a1@naver.com", "010-1234-5651");
        UserDTO obj1 = new UserDTO("id04", "pwd02", "james2", "a2@naver.com", "010-1234-5652");
        UserDTO obj2 = new UserDTO("id05", "pwd03", "james3", "a3@naver.com", "010-1234-5653");
        UserDTO obj3 = new UserDTO("id06", "pwd04", "james4", "a4@naver.com", "010-1234-5654");

        try {
            service.register(obj);
            service.register(obj1);
            service.register(obj2);
            service.register(obj3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======================================");

        //get(k) test
        try {
            UserDTO id04 = service.get("id04");
            System.out.println(id04);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=====================================");

        //get() test
        try {
            List<UserDTO> list = service.getAll();
            for (UserDTO u : list) {
                System.out.println(u);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("=====================================");

        //remove() test
        try {
            service.remove("id01");
        }catch (Exception e){
            System.out.println(e.getMessage());
            }
        }
        //remove all test

        //update : 유저 객체가 다 들어오는 것(일부만 수정하는 개념이 아님)
}



