package com.kbstar.dao;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class AccountDAO implements DAO<String, AccountDTO> {

    HashMap<String, AccountDTO> db;

    public AccountDAO() {
        db = new HashMap<>();
    }

    @Override
    public void insert(AccountDTO accountDTO) throws Exception {
        try {
            if (accountDTO.getAccNo() == "3456") {
                throw new Exception("DB PUT ERROR!");
            }
            db.put(accountDTO.getAccNo(), accountDTO);
        } catch (Exception e) {
            throw new Exception("DB PUT ERROR!");
        }

    }

    @Override
    public void delete(String k) throws Exception {
        try {
            if (k == "bb") {
                throw new Exception("DB DELETE ERROR!");
            }
            db.remove(k);
        } catch (Exception e) {
            throw new Exception("DB DELETE ERROR!");
        }

    }

    @Override
    public void update(AccountDTO accountDTO) throws Exception {
        try {
            db.put(accountDTO.getAccNo(), accountDTO);
        } catch (Exception e) {
            throw new Exception("DB UPDATE ERROR!");
        }

    }

    @Override
    public AccountDTO select(String k) throws Exception {
        try {
            if (db.get(k) == null) {
                throw new Exception("DB GET ERROR!");
            }
            return db.get(k);
        } catch (Exception e) {
            throw new Exception("DB GET ERROR!");
        }

    }

    @Override
    public List<AccountDTO> select() throws Exception {
        try {
            Collection<AccountDTO> values = db.values();
            if (values.isEmpty()) {
                throw new Exception("DB ALL GET ERROR");
            }
            return new ArrayList<>(values);
        } catch (Exception e) {
            throw new Exception("DB ALL GET ERROR");
        }

    }

    @Override
    public void clear() throws Exception {
        db.clear();
    }
}
