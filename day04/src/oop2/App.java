package oop2;

import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {


        DecimalFormat format = new DecimalFormat("###,###");
        Employee e1 = new Employee();
        System.out.println("회원정보1 = " + e1.toString());

        Employee e2 = new Employee("이말숙", 500000);

        System.out.println("회원정보2 = " +e2.toString());
        System.out.println("연봉 = " + format.format(e2.getAnnSalary()));
        System.out.println("세금 = " + format.format(e2.getTax()));

        e2.setName("이말자");
        System.out.println("개명된 이름 = " + e2.toString());

    }
}
