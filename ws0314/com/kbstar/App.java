package com.kbstar;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.service.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.CustCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CRUDService<String, Cust> custService = new CustCRUDServiceImpl();
        CRUDService<String, Item> itemService = new ItemCRUDServiceImpl();
        CRUDService<String, Cart> cartService = new CartCRUDServiceImpl();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input command(q, i, d, u, s, sa)");

                int qt = Integer.parseInt(sc.next());String cmd = sc.next();
                if (cmd.equals("q")) {
                    System.out.println("Bye");
                    break;
                } else if (cmd.equals("i")) {
                    System.out.println("Input Cust ID...");
                    String custId = sc.next();
                    try {
                        Cust cust = custService.get(custId);
                        System.out.println("장바구니 이용 고객은 " + cust.toString() + "입니다");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Input Item ID...");
                    String itemId = sc.next();
                    try {
                        Item item = itemService.get(itemId);
                        System.out.println("담는 아이템은 " + item.toString() + "입니다");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Input cnt...");
                    int cnt = Integer.parseInt(sc.next());
                    Cart cart = new Cart(custId, itemId, cnt);
                    try {
                        cartService.register(cart);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
        }
        sc.close();
    }
}
