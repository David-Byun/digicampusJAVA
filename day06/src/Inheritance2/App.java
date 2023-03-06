import java.util.Date;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Manager();
        Employee e3 = new Sales();

        Object obj1 = new Employee();
        Object obj2 = new Manager();
        Object obj3 = new Date();
    }
}
