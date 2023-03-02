package overloading;

import bank.Account;

public class App {
    public static void main(String[] args) {
        Account acc = new Account("이말숙", 1000);

        System.out.println(acc.toString());
    }
}
