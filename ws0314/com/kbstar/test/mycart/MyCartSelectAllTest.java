package com.kbstar.test.mycart;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

import java.util.List;

public class MyCartSelectAllTest {
    public static void main(String[] args) {
        ShopService<Cust, Cart> service = new ShopServiceImpl();
        try {
            List<Cart> cartList = service.myCart("user5");
            for (Cart a : cartList) {
                System.out.println(a.toString());
            }
            System.out.println("조회 완료");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
