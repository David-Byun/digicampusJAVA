package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

import java.util.List;

public class CustSelectAllTest {
    public static void main(String[] args) {
        CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
        try {
            List<Cust> custList = crudService.get();
            for (Cust a : custList) {
                System.out.println(a.toString());
            }
            System.out.println("조회 완료");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
