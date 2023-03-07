package bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        System.out.println("===================== 계좌 만들기 =====================");
        System.out.println("계좌 이름을 입력하세요 ex)모임통장");
        String name = sc.next();

        System.out.println("예금주 성함을 입력하세요");
        String accHolder = sc.next();

        System.out.println("입금 금액을 입력하세요");


        int money = Integer.parseInt(sc.next());
        try {
            double deposit = account.deposit(money);
            // 계좌 생성
            account.makeAccount(name, accHolder, deposit);
            System.out.println("===================== 다음 계좌가 만들어졌어요 =====================");
            // 계좌 조회
            System.out.println("당신의 계좌는 :  " + account.checkAccount() + " 입니다.");
            // 만든 계좌 정보 조회
        } catch (MinusException e) {
            System.out.println(e.getMessage());
            return;
        }

        // 계좌 입금
        System.out.println("===================== 추가 입금하기 =====================");
        int extraDeposit = Integer.parseInt(sc.next());
        try {
            account.deposit(extraDeposit);
            System.out.println(extraDeposit + "원이 입금되었어요 최종 잔액은 " + account.getBalance() + "원입니다.");
        } catch (MinusException e) {
            System.out.println(e.getMessage() + " 오류가 발생했어요");
            return;
        }

        // 계좌 출금
        System.out.println("===================== 출금하기 =====================");
        int withdrawMoney = Integer.parseInt(sc.next());
        try {
            account.withdraw(withdrawMoney);
            System.out.println(withdrawMoney + "원이 출금되었어요 최종 잔액은 " + account.getBalance());
        } catch (MinusException | NoBalanceException e) {
            System.out.println(e.getMessage());
            return;
        }
        sc.close();
    }
}
