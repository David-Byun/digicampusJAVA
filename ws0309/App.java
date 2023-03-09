import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lotto lotto = new Lotto();
        ArrayList<Integer> lottoNum = new ArrayList<>();

        System.out.println("로또 번호를 입력해주세요(25 이하 숫자 3개)");

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(sc.next());
            if (num > 25 || num <= 0) {
                System.out.println("1~25 숫자만 가능해요!");
                System.out.println("프로그램을 다시 시작해주세요");
                sc.close();
                return;
            }
            lottoNum.add(num);
        }
        lotto.checkRanking(lottoNum);

        sc.close();
        //숫자 입력하면 Lotto 에서 입력받음(리스트) 3개 맞으면 1등 2개 맞으면 2등 1개 맞으면 3등(6숫자 ?)
        //등수가 return
        //당첨금이 얼마냐 1등 금액 , 2등 금액 화면 출력
    }
}
