package array;
import java.util.Arrays;
import java.util.Random;

public class P106 {


    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99)+1;
        }

        int sum = 0;
        int cnt = 0;
        double avg = 0.0;
        System.out.println(Arrays.toString(arr));
        //배열 홀수의 값들의 합과 평균을 구하시오
        for (int s : arr) {
            if (s % 2 == 1) {
                sum += s;
                cnt++;
            }
        }
        avg = (double) sum/ cnt;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
