package com.kbstar.service;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

import java.util.List;

public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

    DAO<String, UserDTO> userDao;
    DAO<String, AccountDTO> accountDao;
    DAO<String, TransactionDTO> transactionDao;
    Notification notification;

    public BankServiceImpl() {
        userDao = new UserDAO();
        notification = new NotificationImpl();
        accountDao = new AccountDAO();
    }

    @Override
    public void register(UserDTO v) throws Exception {
        try {
            userDao.insert(v);
        } catch (Exception e) {
            throw new Exception("등록 오류");
        }
        notification.sendEmail(v.getEmail(), "축하 합니다.");
        notification.sendSMS(v.getContact(), "축하 합니다.");
    }

    @Override
    public UserDTO login(String k, String p) throws Exception {
        UserDTO user = null;
        user = userDao.select(k);
        if (user != null) {
            if (user.getPwd().equals(p)) {
                System.out.println("OK");
            } else {
                throw new Exception("로그인 실패");
            }
        } else {
            throw new Exception("로그인 실패");
        }
        return user;
    }

    @Override
    public UserDTO getUserInfo(String s) throws Exception {
        return userDao.select(s);
    }

    @Override
    public void makeAccount(String k, double balance) throws Exception {
        String accNo = MakeAccountNumber.makeAccNum();
        AccountDTO account = new AccountDTO(accNo, balance, k);
        accountDao.insert(account);
        notification.sendSMS(userDao.select(k).getContact(), accNo+" 계좌를 생성 하셨습니다.");
        notification.sendEmail(userDao.select(k).getEmail(), accNo+" 계좌를 생성 하셨습니다.");
    }

    @Override
    public List<AccountDTO> getAllAcount() throws Exception {
        return accountDao.select();
    }

    @Override
    public List<TransactionDTO> getAllTr(String acc) throws Exception {
        return transactionDao.select();
    }

    @Override
    public void transaction(String sendAcc, String receiveAcc, double balance, String desc, String type) throws Exception {
        System.out.println("금결원 전송..");
        double nowBalance = balance;

        //계좌 정보 수정
        //계좌 잔액 정보를 조회하고 잔액에서 이체하는 금액을 차감한 잔액으로 수정

        AccountDTO foundAccount = accountDao.select(sendAcc);
        switch (type) {
            case "0" :
                nowBalance = foundAccount.getBalance() - balance;
                break;
            case "I":
                nowBalance = foundAccount.getBalance() + balance;
                break;
            default:
                nowBalance = balance;
                break;
        }
        foundAccount.setBalance(nowBalance);
        accountDao.update(foundAccount);
        System.out.println("업데이트된 계좌정보는 다음과 같습니다 : " + foundAccount.toString());

        //거래 내역 추가
        transactionDao.insert(new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc, "KB"));

        //이메일, SNS
        String uid = foundAccount.getAccHolder();
        System.out.println("uid = " + uid);
        UserDTO selectedUser = userDao.select(uid);
        System.out.println("selectedUser = " + selectedUser);
        notification.sendEmail(selectedUser.getEmail(), sendAcc + "계좌에서 " + balance + "원이 출금되었고 현재 잔액은 " + foundAccount.getBalance() + " by email");
        notification.sendSMS(selectedUser.getContact(), sendAcc + "계좌에서 " + balance + "원이 출금되었고 현재 잔액은 " + foundAccount.getBalance() + " by contact");
    }
}
