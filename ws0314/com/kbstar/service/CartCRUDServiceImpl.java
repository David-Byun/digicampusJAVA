package com.kbstar.service;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

import java.util.List;

public class CartCRUDServiceImpl implements CRUDService<String, Cart> {

    DAO<String, String, Cart> cartDAO;

    NotificationImpl notification;

    public CartCRUDServiceImpl() {
        cartDAO = new CartDaoImpl();
        notification = new NotificationImpl();
    }

    @Override
    public void register(Cart cart) throws Exception {
        //회원 검증
        try {
            String id = MakeItemNumber.makeItemNum();
            cart.setId(id);
            cartDAO.insert(cart);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            return;
        }

        //email, sms발송
        notification.sendSMS("010-2323-3434", "장바구니가 추가 되었습니다 by SMS");
        notification.sendEmail("david@naver.com", "장바구니가 추가되었어요 by email!");
    }

    @Override
    public void modify(Cart cart) throws Exception {
        try {
            cartDAO.update(cart);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void remove(String s) throws Exception {
        try {
            cartDAO.delete(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @Override
    public Cart get(String s) throws Exception {
        Cart cart = null;
        try {
            cart = cartDAO.select(s);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cart;
    }

    @Override
    public List<Cart> get() throws Exception {
        List<Cart> cartList =null;
        try {
            cartList = cartDAO.selectAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cartList;
    }
}
