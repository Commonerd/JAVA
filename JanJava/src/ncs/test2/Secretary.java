package ncs.test2;

public class Secretary extends Employee implements Bonus{
	
	
	
	
	public Secretary(){super();}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}//생성자가 하는 일은 인스턴스 변수를 초기화하는 것이다.
	//항상 기본생성자와 함께 만드는 것을 습관화 하자.
	
	@Override
	public double tax () {
		return getSalary() * 0.1;
	}
	
	@Override
	public void incentive(int pay) {
		setSalary((int)(pay * 0.8) + getSalary());
		// salary += pay *0.8 => 이렇게 안된다.
		// 겟 셀러리로 값 호출하고 
		//페이 *0.8은 더블 타입이니까 인트로 캐스팅해주고(인센티브 메서드의 매개변수가 인트페이니까)
		//셋샐러리 안에 위의 값과 겟샐러리 더해서 저장. 
	}

}
