package com.kbstar.test.user;


import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserCRUDServiceImpl;

public class UserUpdateTest {

    public static void main(String[] args) {
        CRUDService<String, UserDTO> crudService = new UserCRUDServiceImpl();

        UserDTO user = new UserDTO("id03", "221", "왕밤빵", "0821@gmail.com", "01020170820");
        try {
            crudService.modify(user);
            System.out.println("성공");
        } catch (Exception e) { // 여기서는 실제로 고객에게 메시지를 노출시켜야 함
            System.out.println(e.getMessage());
        }
    }
}