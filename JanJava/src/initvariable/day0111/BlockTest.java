package initvariable.day0111;

public class BlockTest {

	static {System.out.println("static{}");}
	{System.out.println("{}");}
	BlockTest(){
		System.out.println("생성자");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockTest bt = new BlockTest();
		//초기화블럭 {} -> 생성자 
		BlockTest bt1 = new BlockTest();
	}	//초기화블럭 -> 생성자 순서대로 실행

}
