package com.kbstar.test.cart;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

public class CartUpdateTest {
    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();

        Cart cart = new Cart("2023314788100","user5", "item5", 3);
        try {
            service.modify(cart);
            System.out.println("성공");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
