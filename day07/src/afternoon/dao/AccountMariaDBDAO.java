package dao;

import frame.DAO;

public class AccountMariaDBDAO implements DAO {

    @Override
    public void insert(Object obj) {
        System.out.println(obj);
        System.out.println("Inserted Account MariaDB Database");
    }

    @Override
    public void update(Object obj) {
        System.out.println(obj);
        System.out.println("Updated Account MariaDB Database");
    }

    @Override
    public void delete(Object obj) {
        System.out.println(obj);
        System.out.println("Deleted Account MariaDB Database");
    }
}
