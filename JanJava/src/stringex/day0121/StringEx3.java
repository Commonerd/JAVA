package stringex.day0121;

public class StringEx3 {
	public static void main(String[] args) {
		//공백 <숫자 <대문자 <소문자 <한글: 공숫대소한  사전상 앞에 오는 순서순.
		String a = "aaa";
		String b = "bbb";
		
		int i  = a.compareTo(b); // -1
		int i2 = b.compareTo(a); // 1
		int i3 = a.compareTo("aaa"); // 0: 0이 나오면 마지막자리까지 계속 비교. 좌항과 우항은 같다고 인식됨
		
		System.out.println(i);//-1
		System.out.println(i2);//1
		System.out.println(i3);//0
		
		int result = "abcd".compareTo("abcz"); //주의필요 a - a = 0; b - b = 0; c - c = 0 ; d - z = -22 => 음수가 나왔으니 앞에있는 애가 더 작다고 판단함. 
		if(result == 0) {
			System.out.println("\"abcd\"와 \"abcz\"는 같습니다.");
		}else if( result < 0) {
			System.out.println("\"abcd\"가 \"abcz\"보다 작습니다.");
		}else if( result > 0){
			System.out.println("\"abcd\"가 \"abcz\"보다 큽니다.");
		}
		
	}

}
