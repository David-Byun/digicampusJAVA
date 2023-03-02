package bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Account acc = null;
        double balance = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Input Command(c,w,d,s,q)..");
            String cmd = sc.next();
            if (cmd.equals("q")) {
                System.out.println("Bye ...");
                break;
            } else if (cmd.equals("c")) {
                System.out.println("Create Account : ");
                System.out.println("Input Account Info[name, balance]");

                System.out.println("Input Name : ");
                String name = sc.next();

                System.out.println("Input Balance : ");
                balance = Double.parseDouble(sc.next());

                acc = new Account(name, balance);
                System.out.println("acc = " + acc);

            } else if (cmd.equals("w")) {
                System.out.println("출금 금액을 입력하세요");
                double amount = Double.parseDouble(sc.next());
                if (amount > balance) {
                    System.out.println("출금 금액이 잔액보다 커요");
                    return;
                }
                balance -= amount;
                System.out.println("남은 잔액 : " + balance);

            } else if (cmd.equals("d")) {
                System.out.println("입금 금액을 입력하세요");
                double amount = Double.parseDouble(sc.next());
                balance += amount;
                System.out.println("남은 잔액 : " + balance);
            } else if (cmd.equals("s")) {
                System.out.println("현재 계좌정보는 : " + balance);
            }
        }
        sc.close();
    }
}
