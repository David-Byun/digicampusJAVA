package dao;

import dto.ItemDTO;
import frame.DAO;

import java.util.*;

public class ItemDAO implements DAO<String, ItemDTO> {
    Map<String, ItemDTO> db;

    public ItemDAO() {
        db = new HashMap<>();
    }

    @Override
    public void insert(ItemDTO itemDTO) throws Exception {
        if (db.containsKey(itemDTO.getId())) {
            throw new Exception("이미 해당 아이템이 존재합니다.");
        }
        db.put(itemDTO.getId(), itemDTO);
    }

    @Override
    public void delete(String s) throws Exception {
        if (!db.containsKey(s)) {
            throw new Exception("삭제할 아이템이 존재하지 않아요!");
        }
        db.remove(s);
    }

    @Override
    public void update(ItemDTO itemDTO) throws Exception {
        if (!db.containsKey(itemDTO.getId())) {
            throw new Exception("업데이트 할 아이템이 존재하지 않아요!");
        }
        db.put(itemDTO.getId(), itemDTO);
    }

    @Override
    public ItemDTO select(String s) throws Exception {
        if (!db.containsKey(s)) {
            throw new Exception("해당 아이템이 존재하지 않습니다");
        }
        return db.get(s);
    }

    @Override
    public List<ItemDTO> selectAll() throws Exception {
        List<ItemDTO> list = new ArrayList<>();
        Collection<ItemDTO> dtoCollection = db.values();
        dtoCollection.stream().forEach(list::add);
        return list;
    }
}
