import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

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
            winningNum.add(r.nextInt(25) + 1);}
        prizeMoney = r.nextInt(2000000000)+1;
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
                prizeMoney = prizeMoney * 0.5;
                break;
            case 2:
                prizeMoney = prizeMoney * 0.3;
                break;
            case 3:
                prizeMoney = prizeMoney * 0.2;
                break;
            default :
                prizeMoney = 0;
                break;
        }
        System.out.println(grade + "등 /" + " 당첨금 : " + new BigDecimal(Math.floor(prizeMoney)).toString() + "원");
        return prizeMoney;
    }
}
