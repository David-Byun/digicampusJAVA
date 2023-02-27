package array;

public class P102 {


    public static void main(String[] args) {
        int a = 100;

        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("arr = " + arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
        System.out.println("Type 2 ");

        for(int data:arr){
            System.out.println("data = " + data);
        }
    }
}
