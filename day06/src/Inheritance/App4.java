import java.util.Arrays;

public class App4 {

    public static void main(String[] args) {
        // Manager is a Employee
        Employee e = new Manager("100", "james", 500, 50);

        Employee ea[] = new Employee[4];
        ea[0] = new Employee("100", "james", 550);
        ea[1] = new Employee("102", "hames", 600);
        ea[2] = new Manager("103", "kames", 500, 50);
        ea[3] = new Manager("103", "haha", 800, 20);

        for (Employee a : ea) {
            System.out.println(a);
            System.out.println(a.getAnnSalary());
        }
    }
}
