package com.kbstar.dto;

import java.util.Date;

public class AccountDTO {

    private String accNo;
    private double balance;
    private String accholder;
    private Date madeDate;
    public AccountDTO() {
    }
    public AccountDTO(String accNo, double balance, String accholder) {
        this.accNo = accNo;
        this.balance = balance;
        this.accholder = accholder;
    }

    public AccountDTO(String accNo, double balance, String accholder, Date madeDate) {
        this.accNo = accNo;
        this.balance = balance;
        this.accholder = accholder;
        this.madeDate = madeDate;
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


    public String getaccHolder() {
        return accholder;
    }


    public void setaccHolder(String accholder) {
        this.accholder = accholder;
    }


    public Date getMadeDate() {
        return madeDate;
    }


    public void setMadeDate(Date madeDate) {
        this.madeDate = madeDate;
    }


    @Override
    public String toString() {
        return "AccountDTO [accNo=" + accNo + ", balance=" + balance + ", accholder=" + accholder + ", madeDate=" + madeDate+"]";
    }




}