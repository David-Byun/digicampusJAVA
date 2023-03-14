package com.kbstar.frame;

public class Sql {
    // Cust DML
    public static String deleteSql = "delete from cust where id = ?";
    public static String insertSql = "insert into cust values(?,?,?,?)";
    public static String selectAllSql = "select * from cust";
    public static String selectSql = "select * from cust where id=?";
    public static String updateSql = "update cust set pwd = ?, name = ?, age = ? where id = ?";

    // Item DML
    public static String itemDeleteSql = "delete from item where id = ?";
    public static String itemInsertSql = "insert into item values(?,?,?,?,SYSDATE)";
    public static String itemUpdateSql = "update item set name = ?, price = ?, rate = ? where id = ?";
    public static String itemSelectSql = "select * from item where id=?";
    public static String itemSelectAllSql = "select * from item";

}
