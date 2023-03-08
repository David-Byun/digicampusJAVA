package bank.service;

import bank.DAO.ItemDAO;
import bank.DTO.ItemDTO;
import bank.frame.DAO;
import bank.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService {

    DAO<Integer, ItemDTO> dao;

    public ItemService() {
        dao = new ItemDAO();
    }

    @Override
    public void register(ItemDTO itemDTO) throws Exception {
        System.out.println(itemDTO.toString() + "Data Check..");
        dao.insert(itemDTO);
        System.out.println("Send SMS..");
    }
    @Override
    public void remove(Integer integer) throws Exception {
        dao.delete(integer);
    }

    @Override
    public void modify(ItemDTO itemDTO) throws Exception {
        System.out.println(itemDTO + "Data Check..");
        try {
            dao.update(itemDTO);
        } catch (Exception e) {
            throw e;
        }
        System.out.println("Send SMS..");

    }

    @Override
    public void search() {
        System.out.println("현재 검색중입니다");
    }
}
