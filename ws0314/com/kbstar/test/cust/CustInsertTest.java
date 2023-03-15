package com.kbstar.test.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {
    public static void main(String[] args) {
        CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
        Cust cust = new Cust("id20", "pwd30", "tom", 30);
        try {
            crudService.register(cust);
            System.out.println("입력 성공!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
