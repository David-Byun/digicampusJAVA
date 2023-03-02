public class App {
    public static void main(String[] args) {

        Account[] accounts = new Account[6];
        accounts[0] = new Account("james1", 10000, 0.35, "VIP");
        accounts[1] = new Account("james2", 10000, 0.45, "GOLD");
        accounts[2] = new Account("james3", 10000, 0.55, "SIVER");
        accounts[3] = new Account("james4", 10000, 0.15, "GOLD");
        accounts[4] = new Account("james5", 10000, 0.28, "SIVER");
        accounts[5] = new Account("james6", 10000, 0.31, "VIP");

        for (Account a : accounts) {
            System.out.println("계좌 정보 : " + a);
            System.out.println("잔액 : " + a.getBalance());
            System.out.println("현재 이자금액 : " + a.getInterest());
            System.out.println("============================================================");
        }

        int sum = 0;
        int cnt = 0;
        for (Account a : accounts) {
            if (a.getGrade() == "VIP") {
                sum += a.getBalance();
                cnt++;
            }
        }
        System.out.println("VIP 들의 잔액의 합 : " + sum);
        System.out.println("VIP 들의 잔액의 평균 : " + sum / cnt);

    }
}
