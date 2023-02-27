package array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Stream;

public class P104 {


    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99)+1;
        }

        int sum = 0;

        //배열의 합과 평균을 구하시오
        for (int a : arr) {
            sum = sum + a;
        }

        System.out.println("sum = " + sum);
        System.out.println("avg = " + (double) sum / arr.length);

        OptionalDouble avgSum = Arrays.stream(arr).average();
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).max().orElse(0));

        if (avgSum.isPresent()) {
            System.out.println("avgSum = " + avgSum.getAsDouble());
        } else {
            System.out.println("평균을 계산할 수 없어요");
        }


    }
}
