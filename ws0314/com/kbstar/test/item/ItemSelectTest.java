package com.kbstar.test.item;

import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectTest {
    public static void main(String[] args) {
        CRUDService<String, Item> service = new ItemCRUDServiceImpl();

        try {
            Item item = service.get("1111");

            System.out.println(item.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
