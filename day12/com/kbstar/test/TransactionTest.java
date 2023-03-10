package com.kbstar.test;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.TransactionService;

import java.util.List;

public class TransactionTest {
    public static void main(String[] args) {
        CRUDService<String, TransactionDTO> service = new TransactionService();
        TransactionDTO obj =
                new TransactionDTO(MakeAccountNumber.makeTrNum(),"20230309101",500,"O","lalala","국민카드");
        TransactionDTO obj2 =
                new TransactionDTO(MakeAccountNumber.makeTrNum(),"20230309102",600,"O","hahaha","국민카드");
        TransactionDTO obj3 =
                new TransactionDTO(MakeAccountNumber.makeTrNum(),"20230309103",700,"O","gagaga","국민카드");

        try {
            service.register(obj);
            service.register(obj2);
            service.register(obj3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // get(k) test ------------------------------------
        TransactionDTO Transaction = null;
        try {
            Transaction = service.get("202339625100");
            System.out.println(Transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // get() test ------------------------------------
        // Emp e = new Manager();
        // List list = new ArrayList();

        List<TransactionDTO> list = null;

        try {
            list = service.getAll();
            for(TransactionDTO u: list) {
                System.out.println(u);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
