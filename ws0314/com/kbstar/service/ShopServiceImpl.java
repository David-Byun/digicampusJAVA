package com.kbstar.service;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

import java.util.List;

public class ShopServiceImpl implements ShopService<Cust, Cart> {
    DAO<String, String, Cust> custDAO;
    DAO<String, String, Item> itemDAO;
    DAO<String, String, Cart> cartDAO;
    public ShopServiceImpl() {
        custDAO = new CustDaoImpl();
        itemDAO = new ItemDaoImpl();
        cartDAO = new CartDaoImpl();
    }
    @Override
    public Cust login(String id, String pwd) throws Exception {
        Cust cust = custDAO.select(id);
        if (cust != null) {
            if (cust.getPwd().equals(pwd)) {
                System.out.println("OK");
            } else {
                throw new Exception("비밀번호가 틀려요!");
            }
        } else {
            throw new Exception("로그인 실패!");
        }
        return cust;
    }

    @Override
    public void register(Cust cust) throws Exception{
        try {
            custDAO.insert(cust);
        } catch (Exception e) {
            throw new Exception("등록 오류");
        }
    }

    @Override
    public List<Cart> myCart(String id) throws Exception{
        List<Cart> list = cartDAO.search(id);
        return list;
    }
}
