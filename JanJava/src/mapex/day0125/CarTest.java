package mapex.day0125;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance( );
		
		Car sonata1 = factory.createCar("연수차");
		Car sonata2 = factory.createCar("연수차");//이미 키에 매핑되어있음. 이미 만들어져있으니
		//카 객체를 그대로 들고 온다. 
		System.out.println(sonata1 == sonata2); // 
		//왜 같지? 주소값아닌가? 같은 키('연수차')에 매핑되어 있어서 같은 객체를 갖고 오기 떄문. 
	
		Car avante1 = factory.createCar("승연차");
		//없으니 객체가 만들어졌다. 
		Car avante2 = factory.createCar("승연차");
		//
		System.out.println(avante1 == avante2); // 
		System.out.println(sonata1 == avante1); // 
	}

}
