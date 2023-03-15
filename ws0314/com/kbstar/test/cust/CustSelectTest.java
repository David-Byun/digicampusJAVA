package com.kbstar.test.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustSelectTest {
    public static void main(String[] args) {
        CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
        Cust findId;
        try {
            findId = crudService.get("id0100");
            System.out.println(findId.toString());
            System.out.println("불러오기 성공!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
