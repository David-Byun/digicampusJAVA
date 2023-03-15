package com.kbstar.test.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CrudDeleteTest {
    public static void main(String[] args) {
        CRUDService<String, Cust> service = new CustCRUDServiceImpl();
        try {
            service.remove("2023314293100");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
