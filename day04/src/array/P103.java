package array;

public class P103 {


    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("arr = " + arr);

        int[] arr1 = new int[3];

        for (int data : arr) {
            System.out.println("data = " + data);
        }
        
    }
}
