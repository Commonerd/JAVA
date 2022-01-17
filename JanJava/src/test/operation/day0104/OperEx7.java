package test.operation.day0104;

public class OperEx7 {

	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a++);
		// 연산자가 변수 뒤에 있으면 가장 마지막에 실행.
		// 실제 값은 11이지만, 10으로 출력된다.
		System.out.println(++a);
		// 증감연산자가 변수 앞에 있으면 1순위가 된다. 먼저 증가시켜놓고 출력.
		// 화면에 12로 출력된다.
		
		int x = 10;
		int y = 20;
		
		int z = ++x + y--;
		// 1. ++x => 11
		// 2. + => 11+20=31
		// 3. = => z=31
		// 4. y-- => 20-1=19
		System.out.println(x);//12
		System.out.println(y);//20 // 19
		System.out.println(z);//30 // 31
		

	}

}// 
