package com.kbstar.test.cart;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

public class CartInsertTest {

    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();
        Cart cart = new Cart("user02", "item02", 4);
        try {
            service.register(cart);
            System.out.println("입력 성공!");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }
}