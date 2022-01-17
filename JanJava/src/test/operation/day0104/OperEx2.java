package test.operation.day0104;

public class OperEx2 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 5;
		
		System.out.println(num1+num2);
		System.out.println(num1);
		
		System.out.println(num1 += num2); //7+5 한 다음에 결과값 12를 num1에 저장함.
		// num1 = num1+ num2. 편한 걸로 쓰지만, +=가 코드가 더 짧아서 많이 쓰게 됨.
		// 대입연산자는 대입방향이 '오른쪽에서 왼쪽이다!'
		System.out.println(num1); //그래서 num1이 12로 출력됨. 
		
		
		
	}

}
