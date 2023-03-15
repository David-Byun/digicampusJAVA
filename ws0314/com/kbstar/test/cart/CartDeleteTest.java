package com.kbstar.test.cart;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

public class CartDeleteTest {
    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();
        try {
            service.remove("2023314293100");
            System.out.println("성공");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
