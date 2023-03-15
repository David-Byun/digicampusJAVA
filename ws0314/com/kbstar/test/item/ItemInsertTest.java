package com.kbstar.test.item;

import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {
    public static void main(String[] args) {
        CRUDService<String, Item> service = new ItemCRUDServiceImpl();
        Item item = new Item("T-shirts", 18000, 2.2);
        try {
            service.register(item);
            System.out.println("입력 성공!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
