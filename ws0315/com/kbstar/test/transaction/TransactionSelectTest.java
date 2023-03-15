package com.kbstar.test.transaction;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TransactionService;

public class TransactionSelectTest {
    public static void main(String[] args) {
        CRUDService<String, TransactionDTO> service = new TransactionService();

        try {
            TransactionDTO findTran = service.get("343434");
            System.out.println(findTran.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
