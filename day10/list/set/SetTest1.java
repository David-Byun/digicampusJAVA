package list.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // 1~10까지의 숫자를 10개 입력하세요
        Random r = new Random();

        int c = 0;
        while (set.size() != 10) {
            for (int i = 0; i < 10; i++) {
                int num = r.nextInt(10) + 1;
                set.add(num);
            }
            c++;
        }
        System.out.println("c = " + c);
        System.out.println(set.size());
        System.out.println("=======================");

        for (int data : set) {
            System.out.println(data);
        }
    }
}
