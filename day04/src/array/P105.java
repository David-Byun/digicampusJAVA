package array;
import java.util.Random;

public class P105 {


    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99)+1;
        }

        int sum = 0;
        int cnt = 0;

        //배열의 합과 평균을 구하시오
        //홀수 번째의 합과 평균을 구하시오
        for (int i =0 ; i<arr.length ; i++) {
            if(i % 2 == 0){
                sum = sum + arr[i];
                cnt++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + (double) sum / cnt);


    }
}
