package com.kbstar.test.transaction;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TransactionService;

import java.util.List;

public class TransactionSearchAllTest {
    public static void main(String[] args) {
        CRUDService<String, TransactionDTO> tranService = new TransactionService();

        try {
            List<TransactionDTO> allTran = tranService.search("김민수");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
