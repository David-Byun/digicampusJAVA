package com.kbstar.dto;

public class TransactionDTO {
    private String date;
    private String accNo;
    private double balance;
    private String type; // I / O
    private String desc;

    private String accHolder;

    public TransactionDTO() {
    }

    public TransactionDTO(String accNo, double balance, String type, String desc, String accHolder) {
        this.accNo = accNo;
        this.balance = balance;
        this.type = type;
        this.desc = desc;
        this.accHolder = accHolder;
    }

    public TransactionDTO(String date, String accNo, double balance, String type, String desc, String accHolder) {
        this.date = date;
        this.accNo = accNo;
        this.balance = balance;
        this.type = type;
        this.desc = desc;
        this.accHolder = accHolder;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "date='" + date + '\'' +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", accHolder='" + accHolder + '\'' +
                '}';
    }
}
