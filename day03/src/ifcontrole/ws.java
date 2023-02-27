package ifcontrole;

public class ws {
    public static void main(String[] args) {
        // 1~100까지의 숫자 중
        // 1. 3의 배수의 합과 평균을 구하시오
        // 2. 4의 배수의 합과 평균을 구하시오
        // 3. 7의 배수의 합과 평균을 구하시오


        double avg1 = 0;
        int sum1 = 0;
        int cnt1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum1 += i;
                cnt1++;
            }
        }
        avg1 = sum1 / (cnt1 * 1.0);
        System.out.println("3의 배수 합 = " + sum1);
        System.out.println("3의 배수 평균 = " + avg1);
        System.out.println("3의 배수 개수 = " + cnt1);


        double avg2 = 0;
        int sum2 = 0;
        int cnt2 = 0;
        int i2 = 1;
        while (i2 <= 100) {
            if (i2 % 4 == 0) {
                sum2 += i2;
                cnt2++;
            }
            i2++;
        }
        avg2 = (sum2 * 1.0) / cnt2;
        System.out.println("4의 배수 합 = " + sum2);
        System.out.println("4의 배수 평균 = " + avg2);
        System.out.println("4의 배수 개수 = " + cnt2);

        double avg3 = 0;
        int sum3 = 0;
        int cnt3 = 0;
        int i3 = 1;
        while (i3 <= 100) {
            if (i3 % 7 == 0) {
                sum3 += i3;
                cnt3++;
            }
            i3++;
        }
        avg3 = (sum3 * 1.0) / cnt3;
        System.out.println("7의 배수 합 = " + sum3);
        System.out.println("7의 배수 평균 = " + avg3);
        System.out.println("7의 배수 개수 = " + cnt3);


        for(int i=2;i<10;i++) {
            System.out.printf("%d 단 \n",i);
            for(int j=1;j<10;j++) {
                System.out.printf("%d * %d = %d \n",i,j,(i*j));
            }
        }
    }
}
