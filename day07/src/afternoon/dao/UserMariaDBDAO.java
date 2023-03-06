package dao;

import frame.DAO;

public class UserMariaDBDAO implements DAO {

    @Override
    public void insert(Object obj) {
        System.out.println(obj);
        System.out.println("Inserted User MariaDB Database");
    }

    @Override
    public void update(Object obj) {
        System.out.println(obj);
        System.out.println("Updated User MariaDB Database");
    }

    @Override
    public void delete(Object obj) {
        System.out.println(obj);
        System.out.println("Deleted User MariaDB Database");
    }
}
