package com.kbstar.frame;

public class Sql {
    public static String deleteSql = "delete from cust where id = ?";
    public static String insertSql = "insert into cust values(?,?,?,?)";
    public static String selectAllSql = "select * from cust";
    public static String selectSql = "select * from cust where id=?";
    public static String updateSql = "update cust set pwd = ?, name = ?, age = ? where id = ?";
}
