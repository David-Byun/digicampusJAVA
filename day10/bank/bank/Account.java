package bank.bank;

public class Account {
    private String accNo;
    private String name;
    private String accHolder;
    private double balance;

    private Account account;

    public Account() {
    }

    // Constructor - 음수 예외 상황
    public Account(String name, String accHolder, double balance) throws MinusException{
        this.accNo = MakeAccoutNum.makeAccNum();
        this.name = name;
        this.accHolder = accHolder;
        if (balance < 0) {
            throw new MinusException("음수 금액으로 계좌를 만들 수 없어요!");
        }
        this.balance = balance;
    }

    public Account(double balance) {
        super();
        this.balance = balance;
    }

    public Account(String accNo, String name, String accHolder, double balance) throws MinusException {
        this.accNo = accNo;
        this.name = name;
        this.accHolder = accHolder;
        if (balance < 0) {
            throw new MinusException("음수 금액으로 계좌를 만들 수 없어요!");
        }
        this.balance = balance;
    }

    // 계좌 정보 조회
    public Account checkAccount() {
        return account;
    }

    // 계좌 만들기
    public Account makeAccount(String name, String accHolder, double balance) {
        account = new Account(name, accHolder, balance);
        return account;
    }

    // 잔액 조회
    public double getBalance() {
        return balance;
    }

    // 입금 - 음수 예외 상황
    public double deposit(int money) throws MinusException {
        if (money < 0) {
            throw new MinusException("음수를 입금했어요. 양수만 가능해요!");
        }
        balance += money;
        return balance;
    }

    // 출금 - 잔액 부족 예외 상황, 음수 예외 상황
    public double withdraw(int money) throws MinusException {
        if (money < 0) {
            throw new MinusException("음수를 입금했어요. 양수만 가능해요!");
        }
        if (balance - money < 0) {
            throw new NoBalanceException("잔액이 부족해요. 잔액을 확인해주세요!");
        }
        balance -= money;
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", name='" + name + '\'' +
                ", accHolder='" + accHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
