public class P95 {
    public static void main(String[] args) {
        //짝수만 구하시오
        //합과 평균을 구하시오
        int sum = 0;
        double avg = 0;
        int cnt = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0){
                sum += i;
                cnt++;
            }
            if (i == 8) {
                break;
            }
            i++;

        }
        avg = (sum*1.0)/ cnt;
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);

    }
}
