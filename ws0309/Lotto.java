import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

    private HashSet<Integer> winningNum = new HashSet<>();
    private double prizeMoney;

    Random r = new Random();
    public Lotto() {
        makeWinningNumberMoney();
    }

    //당첨번호 1~25까지의 숫자 중 3개를 선정
    public void makeWinningNumberMoney() {

            while(winningNum.size() < 3){
                winningNum.add(r.nextInt(25) + 1);
            }

        System.out.println("winningNum = " + winningNum);
        prizeMoney = r.nextInt(20000000) + 1;
        System.out.println("prizeMoney = " + prizeMoney);
    }

    public double checkRanking(ArrayList<Integer> myNum) {
        int cnt = 0;
        int grade = 0;
        for (Integer a : winningNum) {
            for (Integer b : myNum) {
                if (a == b) {
                    cnt++;
                }
            }
        }
        grade = 4 - cnt;
        return prizeMoney(grade);
    }

    //당첨금 리턴
    public double prizeMoney(int grade) {
        switch(grade) {
            case 1:
                this.prizeMoney = prizeMoney * 0.5;
                break;
            case 2:
                this.prizeMoney = prizeMoney * 0.3;
                break;
            case 3:
                this.prizeMoney = prizeMoney * 0.2;
                break;
            default :
                this.prizeMoney = 0;
                break;
        }
        System.out.println(grade + "등 /" + " 당첨금 : " + prizeMoney + "원");
        return prizeMoney;
    }

}
