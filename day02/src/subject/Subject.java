package subject;

import java.util.Scanner;

public class Subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하시오");
        int score = Integer.parseInt(sc.next());
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        System.out.println("grade = " + grade);
        sc.close();
    }
}
