package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 1 ~ 10 까지의 숫자를 20개 입력한다.
        // 단, while 문을 이용한다.
        Random r = new Random();

        while(list.size() < 20) {
            list.add(r.nextInt(10) + 1);
        }

        // list 정보를 출력하세요.
        for (int b : list) {
            System.out.println(b);
        }
        System.out.println(list.size());
    }
}
