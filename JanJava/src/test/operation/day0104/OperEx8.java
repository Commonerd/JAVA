	package test.operation.day0104;
	
	public class OperEx8 {
	
		public static void main(String[] args) {
			int score = 90;
			
			//char grade = score >= 90 ? 'A' : 'B' ;
					// ? 나오면 앞에 조건식 먼저 처리해서 참인지 거짓인지.
					// 참이면 앞, 거짓이면 뒤값 반환. 
			char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');
			// 삼항 연산자 안에 또 삼항 연산자를 넣으면 A, B, C 다 만들 수 있음.
			System.out.println("학점: "+grade);
			
	
		}
	
	}
