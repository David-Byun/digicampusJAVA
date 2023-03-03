public class App4 {

    public static void main(String[] args) {
        // Manager is a Employee
        Employee e = new Manager("100", "james", 500, 50);

        Employee ea[] = new Employee[5];
        ea[0] = new Employee("100", "james", 500);
        ea[1] = new Employee("102", "hames", 500);
        ea[2] = new Manager("103", "kames", 500, 30);
        ea[3] = new Manager("103", "haha", 500, 20);
        ea[4] = new Sales("104", "sales", 500, "seoul", 0.35);

        for (Employee a : ea) {
            System.out.println(a);
            System.out.println(a.getAnnSalary());
            System.out.println(a.getIncentive());
        }
        System.out.println("=========================================================");
        TaxCal t = new TaxCal();
        double result = t.getTax(ea[3]);
        System.out.println(result);

    }
}
