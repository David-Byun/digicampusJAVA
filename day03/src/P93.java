import java.util.Scanner;

public class P93 {
    private static Scanner sc = new Scanner(System.in);
    private static void check(int input) {
        if (input < 10 || input > 100){
            sc.close();
            return;
        }
    }
    public static void main(String[] args) {
        try {
            // 숫자를 4개의 2자리 수를 입력 받는다. 2자리수가 아니면 프로그램 종료
            int ko = 0;
            int en = 0;
            int ma = 0;
            int si = 0;
            int sum = 0;
            float avg = 0;
            String grade = "";

            System.out.println("국어성적 입력 :");
            ko = Integer.parseInt(sc.next());
            check(ko);

            System.out.println("영어성적 입력 :");
            en = Integer.parseInt(sc.next());
            check(en);

            System.out.println("수학성적 입력 :");
            ma = Integer.parseInt(sc.next());
            check(ma);

            System.out.println("과학성적 입력 :");
            si = Integer.parseInt(sc.next());
            check(si);

            int[] array = new int[4];
            array[0] = ko;
            array[1] = en;
            array[2] = ma;
            array[3] = si;

            // 평균과 합계를 구합니다.
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            avg = sum / array.length;

            // 평균이 90 이상이면 A
            // 평균이 80 이상이면 B
            // 평균이 70 이상이면 C
            // 평균이 60 이상이면 D
            // 60 미만이면 F
            // 합계, 평균, 학점을 출력

            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else if (avg >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("합계 = " + sum);
            System.out.println("평균 = " + avg);
            System.out.println("학점 = " + grade);
            sc.close();
        } catch (IllegalStateException e) {
            System.out.println("처음부터 다시 진행!");
        }
    }
}
