package exception.day0120;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int[] var = {10,200,30};
		
		for(int i= 0 ; i<=3; i++) {
			try {
				System.out.println("***"+(i+1));
				System.out.println(var[i]);
				System.out.println("~~~"+(i+1));
			} catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("예외 발생");//out은 일반적인 문자열 출력.
				System.err.println(e.getMessage());//err은 빨간색으로 '에러메시지'출력.
				e.printStackTrace();//예외추적 메서드
			} finally {
				System.out.println("finally"+(i+1));
			}
		}
		System.out.println();
		System.out.println("Program end!!");
	}

}
