package ws0228;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Employee[] employeeList = new Employee[5];
		Manager[] managerList = new Manager[5];

		String name[] = new String[5];
		name[0] = "이여진";
		name[1] = "장은정";
		name[2] = "변다윗";
		name[3] = "문대호";
		name[4] = "이진만";
		
		String mName[] = new String[5];
		mName[0] = "하니";
		mName[1] = "해린";
		mName[2] = "다니엘";
		mName[3] = "혜인";
		mName[4] = "민지";
		
		Random r = new Random();
		
		for (int i=0; i<employeeList.length; i++) {
			employeeList[i] = new Employee(i+1, name[i], (r.nextInt(9)+1)*1000000);
			managerList[i] = new Manager(i+1, mName[i], (r.nextInt(9)+1)*1000000, (r.nextInt(9)+1)*50000);
		}
		
		for (Employee a:employeeList) {
			System.out.println(a);
		}
		System.out.println("");
		for (Manager a:managerList) {
			System.out.println(a);
		}
		System.out.println("");
		
		for (Employee a:employeeList) {
			System.out.printf("%s의 연봉은 %d백만원, 세금은 월 %4.0f원입니다. \n", a.getName(), (a.getAnnSalary()/1000000), a.getTax());
		}
		
		System.out.println("");
		
		for (Manager a:managerList) {
			System.out.printf("%s의 연봉은 %4.1f백만원, 보너스는 %d원, 세금은 월 %4.0f원입니다. \n", a.getName(), ((a.getAnnSalary()*1.0)/1000000), a.getBonus(), a.getTax());
		}
		
	}

}
