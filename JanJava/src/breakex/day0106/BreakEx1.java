package breakex.day0106;

public class BreakEx1 {

	public static void main(String[] args) {
		A: //레이블 붙이기
		for(int i = 0; i <3; i++ ) {
			for(int j = 0; j< 3; j++) {
				if ( j==1) {break A;} //A. ~ break A *레이블. 바깥구문 종료.
				System.out.println(i+" "+j);
			}//inner
		}//outer

	}//main

}
