package com.kbstar.dto;

public class TransactionDTO {
    private String date; // HashMap에 넣기 위한 Key값
    private String accNo;
    private double balance;
    private String type; // In/Out
    private String desc; // 적요
    public TransactionDTO() {
    }
    public TransactionDTO(String date, String accNo, double balance, String type, String desc) {
        this.date = date;
        this.accNo = accNo;
        this.balance = balance;
        this.type = type;
        this.desc = desc;
    }
    public String getDate() {
        return date;
    }
    public String getAccNo() {
        return accNo;
    }
    public double getBalance() {
        return balance;
    }
    public String getType() {
        return type;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "TransactionDTO [date=" + date + ", accNo=" + accNo + ", balance=" + balance + ", type=" + type
                + ", desc=" + desc + "]";
    }

}