package mapex.day0125;

import java.util.HashMap;

public class CarFactory {
	//여기는 전체적으로 '싱글턴 패턴'을 취하고 있다.
	//싱글턴 패턴이란 객체를 한 번 만들어서 주소값만 받아쓰는 것을 의미한다.
	private static CarFactory cf = new CarFactory();
	//프레임워크에서 ~팩토리를 자주 보게 될 것임: 이것을 객체로 만들어주는 클래스라고 생각하면 된다.
	//한 공장에서만 있어야 하니까 싱글턴으로 만들도록.
	//객체를 한 번만 만들었다. 
	
	private CarFactory(){}
	
	public static CarFactory getInstance() {
		 if(cf == null) {
			 cf = new CarFactory();//없으면 객체 만들고 
		 }
		 return cf;//있으면 있는 것을 반환
	}
	//name - key : value - Car
	HashMap<String, Car> carMap = new HashMap<String, Car>();
	
	public Car createCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}else {
			Car car = new Car(name);//이름이 없으면 해당 이름 가진 객체를 만든다.
			carMap.put(name, car);
			return car;
		}
	}
	
	
}








