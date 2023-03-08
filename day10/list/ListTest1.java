package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(9) + 1);
        }
        list.add(5, 100);
        list.remove(5);

        for (int data : list) {
            System.out.println(data);
        }
    }
}

