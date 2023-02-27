public class P94 {
    public static void main(String[] args) {
        //짝수만 구하시오
        //합과 평균을 구하시오
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
            cnt++;
        }
        avg = sum / (cnt * 1.0);
        System.out.println("cnt = " + cnt);
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);

    }
}
