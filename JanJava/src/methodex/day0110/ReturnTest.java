package methodex.day0110;

public class ReturnTest {

	int add(int a, int b) {// 여기서 a,b는 '매개변수'
		return a+b;
	}
	void add(int a, int b, int[] result) {//매개 변수의 개수에 맞춰서 호출.
		result[0] = a+b;
	}
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		System.out.println(r.add(3, 5));
		
		int[] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]);
	}
}
// 