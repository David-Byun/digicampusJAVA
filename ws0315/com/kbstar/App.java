package com.kbstar;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            UserDTO user = null; // logout시 로그인 정보 초기화
            // UserDTO 정의를 if 안에서 할 경우, 로그인 이후 메뉴에서 사용 불가.
            // while 바로 밑에 선언하면 while 문 안에서 자유롭게 사용 가능
            System.out.println("Login (l) or Register (r) (q) ...");
            String cmd = sc.next();
            if (cmd.equals("q")) {
                break;
            } else if (cmd.equals("r")) {
                System.out.println("Register..");
                String id = sc.next();
                String pwd = sc.next();
                String name = sc.next();
                String email = sc.next();
                String contact = sc.next();
                user = new UserDTO(id, pwd, name, email, contact);
                try {
                    service.register(user);
                    System.out.println("환영합니다.");
                } catch (Exception e) {
                    System.out.println(e.getMessage()); // BankServiceImpl 파일의 throw new Exception("등록 오류") 메시지
                }
            } else if (cmd.equals("l")) {
                System.out.println("Login..");
                String id = sc.next();
                String pwd = sc.next();
                user = null;
                try {
                    user = service.login(id, pwd);
                    System.out.println(user);
                    System.out.println("로그인 성공");
                    System.out.println("------------------------------------");
                    while (true) {
                        System.out.println("Menu(m,t,a,i,tr,e)..."); // 계좌개설, 이체, 계좌조회, 사용자조회, 내역조회, 종료
                        String cmn = sc.next();
                        if (cmn.equals("e")) { // 종료 logout. while문 시작 Login(l) or Register(r) (q) ...
                            break;
                        } else if (cmn.equals("m")) {
                            System.out.println("Make Account...");
                            double balance = Double.parseDouble(sc.next());
                            service.makeAccount(user.getId(), balance);
                            System.out.pr intln("Make Account Completed...");
                        } else if (cmn.equals("t")) {
                            System.out.println("Transaction...");
                            String sendAcc = sc.next();
                            String receiveAcc = sc.next();
                            double balance = Double.parseDouble(sc.next());
                            String desc = sc.next();
                            service.transaction(sendAcc, receiveAcc, balance, desc);
                            System.out.println("Transaction Completed...");
                        } else if (cmn.equals("a")) {
                            System.out.println("Select Account...");
                            List<AccountDTO> list = null;
                            list = service.getAllAccount(user.getId());
                            for (AccountDTO acc : list) {
                                System.out.println(acc);
                            }
                        } else if (cmn.equals("i")) {
                            System.out.println("User Info...");
                            String rid = user.getId();
                            UserDTO ruser = null;
                            ruser = service.getUserInfo(rid);
                            System.out.println(ruser);
                        } else if (cmn.equals("tr")) {
                            System.out.println("Select Transaction...");
                            String accNo = sc.next();
                            List<TransactionDTO> list = null;
                            list = service.getAllTr(accNo);
                            for (TransactionDTO tr : list) {
                                System.out.println(tr);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage()); // BankServiceImpl 파일의 throw new Exception("로그인 실패..."); 메시지
                    e.printStackTrace();
                }
            }
        }
        sc.close();
    }
}