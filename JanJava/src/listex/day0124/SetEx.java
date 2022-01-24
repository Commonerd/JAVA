package listex.day0124;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
//		String[] array = {"1",new String("1"),"2","3","3","3","4"};
		Object[] array = {"1", 1, "2", "3", "3", "3", "4" };
		//이퀄스 메서드 오버라이딩. 현재 타입과 같은 타입이 아니라면, 리턴 거짓처리함.
		//문자열 1과 인티저 1이 왔을 떄 서로 다른 값으로 인식해서 따로 저장. 
		//즉 값의 타입이 다르기 떄문에 중복처리하지 않음. 
//		Set<String> set = new HashSet<String>();
		Set<Object> set = new HashSet<Object>();
//		for(String s : array) {
//			set.add(s);//알아서 중복된 것을 제거함
//		}
		for(Object s : array) {
			set.add(s);
		}
		//"1"이라는 문자의 주소값 저장 ->x10
		//뉴 "1" => 주소값은 다르지만, 문자는 "1"로 같음
		//스트링 안에 있는 이퀄스 메서드 = 문자열 비교하도록 오버라이딩 되어있음
		//1이라는 문자의 해쉬코드 값을 꺼내온다. 
		//"2" ->x10
		//"3" ->x10
		//"4" -> x10
		
		System.out.println(set);
		
	}

}
