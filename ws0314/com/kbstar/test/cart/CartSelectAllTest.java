package com.kbstar.test.cart;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

import java.util.List;

public class CartSelectAllTest {
    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();
        try {
            List<Cart> cartList = service.get();
            for (Cart a : cartList) {
                System.out.println(a.toString());
            }
            System.out.println("조회 완료");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
