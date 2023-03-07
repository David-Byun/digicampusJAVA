package ws0228;

public class Employee {
	private int id;  
	private String name;
	private int salary;
	
	
	public Employee() {
	}

	public Employee(int id, String name, int salary) { // 아이디, 이름, 급여를 입력하면 만들어지는 생성자
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
