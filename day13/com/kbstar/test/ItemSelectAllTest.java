package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

import java.util.List;

public class ItemSelectAllTest {
    public static void main(String[] args) {
        CRUDService<String, Item> service = new ItemCRUDServiceImpl();
        try {
            List<Item> itemList = service.get();
            for (Item a : itemList) {
                System.out.println(a.toString());
            }
            System.out.println("조회 완료");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
