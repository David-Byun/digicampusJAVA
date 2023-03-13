package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CrudDeleteTest {
    public static void main(String[] args) {
        CRUDService<String, Cust> service = new CustCRUDServiceImpl();
        Cust cust = new Cust("29", "pwd30", "tom", 30);
        try {
            service.remove(cust.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
