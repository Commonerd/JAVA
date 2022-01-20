package ncs.test2;

public class Sales extends Employee implements Bonus {
	Sales();

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	public double tax(int salary) {
		return salary *0.13;
	}
	void incentive(int pay, double salary) {
		salary += pay * 1.2;
	};
	
}
