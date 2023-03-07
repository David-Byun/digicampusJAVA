package p213;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num ...");
        int num = 0;
        try {
            num = Integer.parseInt(sc.next());
            int result = 10 / num;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("분모가 0입니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
        } finally {
            System.out.println("반드시 실행.......");
            sc.close();
        }
        sc.close();
        System.out.println("End Application");
    }
}
