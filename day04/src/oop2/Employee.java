package oop2;

import java.text.DecimalFormat;
import java.util.Random;

public class Employee {

    private String id;
    private String name;
    private int salary;


    public Employee() {
        this.id = "1";
        this.name = "temp";
        this.salary = 1000000;
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = checkSalary(salary);
    }

    private int checkSalary(int salary) {
        if (salary < 0) {
            return 0;
        } else {
            return  salary;
        }
    }

    public Employee(String name, int salary) {
        Random r = new Random();
        this.id = String.valueOf(r.nextInt(100) + 1);
        this.salary = checkSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnSalary() {
        return salary * 12;
    }

    public double getTax() {
        return getAnnSalary() * 0.1 ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
