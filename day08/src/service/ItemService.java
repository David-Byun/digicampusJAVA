package service;

import dao.ItemDAO;
import dto.ItemDTO;
import frame.DAO;
import frame.Service;

public class ItemService implements Service<Integer, ItemDTO> {

    DAO<Integer, ItemDTO> dao;

    public ItemService() {
        dao = new ItemDAO();
    }

    @Override
    public void register(ItemDTO itemDTO) {
        System.out.println(itemDTO + "Data Check..");
        dao.insert(itemDTO);
        System.out.println("Send SMS..");
    }

    @Override
    public void remove(Integer integer) {
        dao.delete(integer);
    }

    @Override
    public void modify(ItemDTO itemDTO) {
        dao.update(itemDTO);

    }
}
