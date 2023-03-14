package com.kbstar.test.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustUpdateTest {
    public static void main(String[] args) {
        CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
        Cust cust = new Cust("id06", "업뎃테스트", "업뎃", 10);
        try {
            crudService.modify(cust);
            System.out.println("업데이트 성공!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
