package oopex.day0107;

public class CarMain {

	public static void main(String[] args) {
		Car c;
		c = new Car();
		
		c.speed = 100;
		c.carNumber = "12345678";
		c.model = "2022년 쉐보레 실버라도 픽업트럭";
		c.color = "skyblue";
		
		c.drive(230);
		c.slow(100);
		c.stop();



}
}
