package com.kbstar.frame;

public class Sql {
    // UserInfo DML
    public static String deleteSql = "DELETE FROM userinfo WHERE id = ?";
    public static String insertSql = "INSERT INTO userinfo VALUES(?,?,?,?,?)"; // id, pwd, name, email, contact
    public static String updateSql = "UPDATE userinfo SET pwd=?, name=?, email=?, contact=? WHERE id=?";
    public static String selectSql = "SELECT * FROM userinfo WHERE id = ?";
    public static String selectAllSql = "SELECT * FROM userinfo";

    // Account DML
    public static String AccDeleteSql = "DELETE FROM account WHERE acc_no = ?";
    public static String AccInsertSql = "INSERT INTO account VALUES(?,?,?,SYSDATE)"; // acc_no, balance, acc_holder, made_date
    public static String AccUpdateSql = "UPDATE account SET name=?, price=?, rate=? WHERE acc_no=?";
    public static String AccSelectSql = "SELECT * FROM account WHERE acc_no=?";
    public static String myAccSelectAllSql = "SELECT * FROM account WHERE acc_holder = ?"; // 내 계좌 조회

    // Transaction DML
    public static String TransInsertSql = "INSERT INTO transaction VALUES(SYSDATE, ?, ?, ?, ? ,?)";
    // tran_date, acc_no, balance, type, description, acc_holder
    public static String TransSelectSql = "SELECT * FROM transaction WHERE acc_no=?";
    public static String myTransSelectAllSql = "SELECT * FROM transaction WHERE acc_holder =?";
    // 내 거래 내역 조회
}