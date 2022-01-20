package ncs.test2;

public class Secretary extends Employee implements Bonus{
	Secretary(){}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	double tax(dobule salary) {
		return salary * 0.1;
	}
	
	@Override
	public void incentive(int pay) {
		super.setSalary(super.getSalary() + pay * 0.8);
		
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		
	}

	@Override
	double tax() {
		// TODO Auto-generated method stub
		return 0;
	}


}
