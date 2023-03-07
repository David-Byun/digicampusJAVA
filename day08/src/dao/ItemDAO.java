package dao;

import dto.ItemDTO;
import frame.DAO;

public class ItemDAO implements DAO<Integer,ItemDTO> {

    @Override
    public void insert(ItemDTO itemDTO) {
        System.out.println("등록");
    }

    @Override
    public void update(ItemDTO itemDTO) {
        System.out.println("업데이트");
    }

    @Override
    public void delete(Integer integer) {
        System.out.println("삭제");
    }
}
