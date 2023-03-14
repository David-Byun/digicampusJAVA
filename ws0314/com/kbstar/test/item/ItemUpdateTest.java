package com.kbstar.test.item;

import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemUpdateTest {
    public static void main(String[] args) {
        CRUDService<String, Item> service = new ItemCRUDServiceImpl();

        Item item = new Item("2023314455100", "왜되죠?", 100, 1.1);
        try {
            service.modify(item);
            System.out.println("성공");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
