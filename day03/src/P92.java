public class P92 {
    public static void main(String[] args) {

        //합과 평균을 구하시오
        double avg = 0;
        int sum = 0;
        int cnt = 0;
        System.out.println("Start....");
        for (int i = 1; i <= 100; i++) {
            sum+= i;
            cnt++;
        }
        avg = sum / (cnt * 1.0);
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);
        System.out.println("End....");

    }
}
