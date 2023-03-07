package cal;

import p215.InfinityException;

import java.util.Scanner;

public class CalUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 2 Number");
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double result = 0;
        try {
            result = cal.div(a, b);
        } catch (InfinityException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
