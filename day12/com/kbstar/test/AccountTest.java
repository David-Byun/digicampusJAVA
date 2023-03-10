package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.AccountService;

import java.util.List;

public class AccountTest {
    public static void main(String[] args) throws Exception {

        CRUDService<String, AccountDTO> service = new AccountService();

        AccountDTO account1 = new AccountDTO(MakeAccountNumber.makeAccNum(), 1000, "name1");
        AccountDTO account2 = new AccountDTO("1234", 2000, "name2");
        AccountDTO account3 = new AccountDTO("2345", 3000, "name3");
        AccountDTO account4 = new AccountDTO("3456", 4000, "name4");
        AccountDTO account5 = new AccountDTO(MakeAccountNumber.makeAccNum(), 5000, "name5");

        //계좌 개설 테스트
        try {
            service.register(account1);
            service.register(account2);
            service.register(account3);
            service.register(account5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(service.getAll().toString());
        System.out.println("===============================계좌개설테스트완료===========================");
        try {
            service.register(account4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===============================계좌개설에러테스트완료===========================");

        //계좌 찾기 테스트
        try {
            AccountDTO accountDTO = service.get("1234");
            System.out.println(accountDTO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("===============================계좌찾기테스트완료===========================");
        try {
            AccountDTO accountDTO = service.get("aaaaa");
            System.out.println(accountDTO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===============================계좌찾기에러테스트완료===========================");

        //계좌 해지 테스트
        System.out.println(service.get("1234"));
        service.remove("1234");
        System.out.println("===============================계좌해지테스트완료===========================");
        try {
            service.remove("bb");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===============================계좌해지에러테스트완료===========================");
        //전체 테스트
        List<AccountDTO> all = service.getAll();
        try {
            for (AccountDTO a : all) {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===============================전체계좌찾기테스트완료===========================");
        service.clear();
        try {
            service.getAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("===============================전체계좌찾기에러테스트완료===========================");
    }
}
