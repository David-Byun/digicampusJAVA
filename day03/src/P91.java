public class P91 {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       int c = 15;

       int max = 17;
       int min = 17;

       int[] array = new int[3];
       array[0] = a;
       array[1] = b;
       array[2] = c;

       for (int i = 0; i < array.length ; i++) {
           if (max < array[i]) {
               max = array[i];
           }
           if (min > array[i]) {
               min = array[i];
           }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

       if (a > b) {
            max = a;
            if (b > c) {
                min = c;
            } else {
                min = b;
            }
       } else if (c > a) {
            max = c;
            if (b > a) {
                min = a;
            } else {
                min = b;
            }
       } else if (b > c) {
            max = b;
            if (a > c) {
                min = c;
            } else {
                min = a;
            }
       }


        System.out.println("min = " + min);
        System.out.println("max = " + max);


        if (a > b) {
            max = Math.max(a, c);
            min = Math.min(b, c);
        } else {
            max = Math.max(b, c);
            min = Math.min(a, c);
        }
    }
}
