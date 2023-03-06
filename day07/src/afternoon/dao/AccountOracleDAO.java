package dao;

import frame.DAO;

public class AccountOracleDAO implements DAO {

    @Override
    public void insert(Object obj) {
        System.out.println(obj);
        System.out.println("Inserted Account Oracle Database");
    }

    @Override
    public void update(Object obj) {
        System.out.println(obj);
        System.out.println("Updated Account Oracle Database");
    }

    @Override
    public void delete(Object obj) {
        System.out.println(obj);
        System.out.println("Deleted Account Oracle Database");
    }
}
