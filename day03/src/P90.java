public class P90 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = 0;
        int min = 0;
        // 두 수의 최대값과 최소값을 구하시오.

        //a와 b를 비교해서 큰 수를 max에 작은 수를 min에 넣는다
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.printf("MAX:%d, MIN:%d", max, min);
    }
}
