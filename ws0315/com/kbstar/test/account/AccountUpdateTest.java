package com.kbstar.test.account;


import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;

public class AccountUpdateTest {
    public static void main(String[] args) {
        CRUDService<String, AccountDTO> service = new AccountCRUDServiceImpl();
        
        AccountDTO account = new AccountDTO("id06", 31300, "ahsdh" ); 
        try {
            service.modify(account);
            System.out.println("성공");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}