package interfaceex.day0119;

public class VarTest {

	public void argTest(int a, String...n) {//첫 번째는 인트타입으로 하고, 나머지는 문자열로.. 
		//String...n은 한번만 쓸 수 있고, 마지막에 쓸 수 있다.
		//쓰면 해당타입의 데이터를 배열로 만들어준다 : 자동배열화라고도 한다.
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		VarTest vt = new VarTest();
		vt.argTest(1, "a","b","c");
		vt.argTest(2, "1","2","3","4","5");
	}
//매개변수가 여러개 있어도(원래 매개변수가 여러개면 여러개 메서드 만들어주지만)
//만약 그것들이 같은 역할 하는 메서드라면 '...n'을 통해 생략할 수 있다.
//우리가 쓴다기보단, api안에 있는 경우가 더러 있어서 살펴본 것임.
}
