package wrapper.day0121;

public class WrapperEx1 {
	public static void main(String[] args) {

		Integer i = new Integer(100);
		Integer i2 = new Integer("100"); //숫자로만 이루어져 있으면 숫자를 문자열로 바꿔줄 수 있다. 
		
		System.out.println("i == i2 : "+ (i == i2));
		System.out.println("i.equals(i2) : "+i.equals(i2));// 오버라이딩이 되어있다. 
		//인티저 클래스니까, 저장하고 있는 인트값을 비교할 수 있도록 오버라이딩 비교.
		// 100과 100이 같다. 
		
		System.out.println(i);//참조변수 출력. 참조변수를 출력하면, 늘 toString메서드로 호출. 
		// i < i2 부등호 서로 못쓴다. 
		System.out.println("i.compareTo(i2) : "+i.compareTo(i2));
		
		System.out.println("MAX_VALUE:"+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE:"+Integer.MIN_VALUE);
		System.out.println("SIZE:"+Integer.SIZE);
		System.out.println("BYTES:"+Integer.BYTES);
		System.out.println("TYPE:"+Integer.TYPE);
		
	}
}
