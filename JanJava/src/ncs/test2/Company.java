package ncs.test2;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		Employee e1 = new Employee("Hilery",1,"secretary",800);
		Employee e2 = new Employee("Clinten",2,"sales",1200);
		Employee[] emps = {e1,e2};
		for( Employee e : emps) {
			System.out.println(e);
		}
		e1.setSalary(0); += 100;
		e2.setSalary(0); += 100;
		for( Employee e : emps) {
			System.out.println(e);
			System.out.println(e.tax(0));
		}
	}

}
