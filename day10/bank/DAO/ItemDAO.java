package bank.DAO;

import bank.DTO.ItemDTO;
import bank.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

    @Override
    public void insert(ItemDTO itemDTO) throws Exception {
        connect();
        if (itemDTO.getId() == 10) {
            throw new Exception("EX0004");
        }
        System.out.println(itemDTO);
        System.out.println("등록");
        close();
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
