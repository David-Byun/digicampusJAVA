public class P94 {
    public static void main(String[] args) {

        //합과 평균을 구하시오
        double avg = 0;
        int sum = 0;
        System.out.println("Start....");
        int i = 1;
        while (i <= 100) {
            sum+=i;
            i++;
        }
        avg = (sum * 1.0) / (i-1);
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);
        System.out.println("i = " + i);
        System.out.println("End....");

    }
}
