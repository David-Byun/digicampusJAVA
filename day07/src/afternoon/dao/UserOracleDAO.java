package dao;

import frame.DAO;

public class UserOracleDAO implements DAO {

    @Override
    public void insert(Object obj) {
        System.out.println(obj);
        System.out.println("Inserted User Oracle Database");
    }

    @Override
    public void update(Object obj) {
        System.out.println(obj);
        System.out.println("Updated User Oracle Database");
    }

    @Override
    public void delete(Object obj) {
        System.out.println(obj);
        System.out.println("Deleted User Oracle Database");
    }
}
