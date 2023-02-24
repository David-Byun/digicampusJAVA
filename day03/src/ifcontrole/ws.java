package ifcontrole;

public class ws {
    public static void main(String[] args) {
        // 1~100까지의 숫자 중
        // 1. 3의 배수의 합과 평균을 구하시오
        // 2. 4의 배수의 합과 평균을 구하시오
        // 3. 7의 배수의 합과 평균을 구하시오

        /*
        double avg = 0;
        int sum = 0;
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
                cnt++;
            }
        }
        avg = sum / (cnt * 1.0);
        System.out.println("3의 배수 합 = " + sum);
        System.out.println("3의 배수 평균 = " + avg); */

        /*
        double avg = 0;
        int sum = 0;
        int cnt = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 4 == 0) {
                sum += i;
                cnt++;
            }
            i++;
        }
        avg = (sum * 1.0) / cnt;
        System.out.println("4의 배수 합 = " + sum);
        System.out.println("4의 배수 평균 = " + avg); */

        double avg = 0;
        int sum = 0;
        int cnt = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 7 == 0) {
                sum += i;
                cnt++;
            }
            i++;
        }
        avg = (sum * 1.0) / cnt;
        System.out.println("7의 배수 합 = " + sum);
        System.out.println("7의 배수 평균 = " + avg);
        System.out.println("7의 배수 개수 = " + cnt);
    }
}
