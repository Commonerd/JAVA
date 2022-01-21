package wrapper.day0121;
//String -> int
public class WrapperEx2 {
	public static void main(String[] args) {
		int i = new Integer("100").intValue();	//100
		int i2 = Integer.parseInt("100");//100 
		//"100"을 인트로 바꿔줌.
		//전제조건은? 숫자로만 이루어져있어야 한다. 100A는 아노딘다. 
		//브라우저에 입력한 100은 스트링타입이다.
		//문자열로 전달된 것을 인트로 바꿔야 하는 케이스가 많다.
		Integer i3 = Integer.valueOf("100");//100
		//받아온 것을 인티저로 바꿔준다.
		//반면 string.valueOf는 인티저를 스트링으로. 
		//10진수로 되어있음.
		int i4 = Integer.parseInt("100",2); //2진수로 바꾼다=>4
		int i5 = Integer.parseInt("100",8); //8진수로 바꾼다 => 64 
		int i6 = Integer.parseInt("100",16);//16진수로 바꾼다 => 256
		int i7 = Integer.parseInt("FF",16);// 0~9 A~F: F=15. 16진수로 => 255
		
		System.out.println("\"100\",2 :"+i4);
		System.out.println("\"100\",8 :"+i5);
		System.out.println("\"100\",16 :"+i6);
		System.out.println("\"FF\",16 :"+i7);
	}
}
