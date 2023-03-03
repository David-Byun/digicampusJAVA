public class App2 {
    public static void main(String[] args) {
        //void로 함수 콜했을때 안됐다고 전달할 일이 발생할 수 있다 >> 그게 예외다
        Calculator cal = new Calculator();
        int result = 0;

        result = cal.sum(10, 20);
        System.out.println("result = " + result);

        cal.save(result);
        System.out.println("OK");
    }
}
