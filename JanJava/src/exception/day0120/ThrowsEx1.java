package exception.day0120;

public class ThrowsEx1 {

	public void cutString(String str) throws Exception {
		String s = str.substring(0,1);//원하는 지점부터 해당 인덱스 앞까지 잘라온다.
		printGugudan(s);
	} // ABC의 A 이것도 문자열.
	
	public void printGugudan(String s) throws NumberFormatException {//아래에 트라이 캐치가 없기 떄문에 throws를 씀. 발생하면 호출했던 지점으로 던짐.
		int dan = Integer.parseInt(s);
		for(int i = 0; i<10; i++) {
			System.out.printf("%d * %d = %d",dan,i,(dan*1));
		}
	}
	
	public static void main(String[] args) {
		ThrowsEx1 t1 = new ThrowsEx1();
		try{
			t1.cutString(args[0]);//Run Config ABCD
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
			e.printStackTrace();
		}
		
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //5번줄의 예외 형태에 따라 밑줄에러가 날 수도 안날 수도 있음.
		}
	}


