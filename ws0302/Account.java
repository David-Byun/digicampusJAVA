public class Account {
    private String accNum;
    private String accName;
    private double balance;
    private String grade;
    private double rate;

    public Account() {
        this.accNum =  MakeAccountNumber.makeAccNum();
    }

    public Account(String accName, double balance, double rate, String grade) {
        this();
        this.accName = accName;
        this.balance = balance;
        this.rate = rate;
        this.grade = grade;
    }

    public Account(String accNum, String accName, double balance) {
        this();
        this.accNum = accNum;
        this.accName = accName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", accName='" + accName + '\'' +
                ", balance=" + balance +
                ", grade='" + grade + '\'' +
                ", rate=" + rate +
                '}';
    }

    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("0원 이하 금액은 출금할 수 없어요");
            return;
        }
        if (money > balance) {
            System.out.println("잔액이 부족해요");
        } else {
            balance -= money;
            System.out.println(money + " 금액을 출금했어요. 남은 잔액은 " + balance + " 에요");
        }
    }

    public void deposit(double money) {
        if (money <= 0) {
            System.out.println("0원 이하 금액은 입금할 수 없어요");
            return;
        }
        balance += money;
        System.out.println(money + " 금액을 입금했어요. 남은 잔액은 " + balance + " 에요");

    }

    public String getGrade() {
        return grade;
    }

    public double getInterest() {
        return balance * rate;
    }

    public double getBalance() {
        return balance;
    }
}
