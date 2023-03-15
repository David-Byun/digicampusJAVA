package com.kbstar.frame;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

public interface DAO<K,V> {
    public void insert(V v) throws Exception;
    public void delete(K k) throws Exception;
    public void update(V v) throws Exception;
    public V select(K k) throws Exception;
    public List<V> selectAll() throws Exception;
    public default List<V> search(K k) throws Exception {
        return null;
    }

    public default Connection getConnection() throws Exception { // 연결이 끊어졌거나 방화벽이 켜져있거나
        Connection con = null;
        Properties props = new Properties();
        String fileName = "db_info.txt";
        FileInputStream in = new FileInputStream(fileName);
        props.load(in);

        String id = props.getProperty("DB_ID");
        String pwd = props.getProperty("DB_PWD");
        String url = props.getProperty("DB_URL");
        con = DriverManager.getConnection(url, id, pwd); // 이렇게 하면 코드 상에 id나 pwd를 기입하지 않아도 됨
        return con;
    }
}
