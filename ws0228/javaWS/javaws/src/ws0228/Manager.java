package ws0228;

public class Manager {
	private int id;  
	private String name;
	private int salary;
	private int bonus;
	
	
	public Manager() {
	}

	public Manager(int id, String name, int salary, int bonus) { // 아이디, 이름, 급여, 보너스를 입력하면 만들어지는 생성자
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 0;
			return;
		}
		this.salary = salary;
		if(bonus < 0) {
			this.bonus = 0;
			return;
		}
		this.bonus = bonus;
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
	
	public int getBonus() {
		return bonus;
	}

	public int getAnnSalary() {
		return ((this.salary + this.bonus) * 12);
	}

	public double getTax() {
		return (this.salary + this.bonus) * 0.1;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
