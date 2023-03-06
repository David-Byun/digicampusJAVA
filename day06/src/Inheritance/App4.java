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

        // 상위 클래스에 있는 함수 그대로 만들어야 한다. 새로운 함수가 등장하면 불러오지 못한다. 새로 만들순 있어도 부모 객체로 초기화할 경우 새로운 함수를 받을 수 없음
        for (Employee a : ea) {
            System.out.println(a);
            System.out.println(a.getAnnSalary());
            //a 가 Sales 의 객체면 Sales로 바꿔서 사용하겠다(a instance of Sales) > class casting
            if (a instanceof Sales) {
                Sales s = (Sales) a;
                System.out.println(s.getIncentive());
            }
        }

    }
}