package interfaceex.day0119;

public class WeekTest {

	public static void main(String[] args) {
		Week today = Week.WED;
		System.out.println(today);
		System.out.println(today.name());//객체의 문자열 리턴
		System.out.println(today.ordinal());//순번);
		System.out.println(today.compareTo(Week.FRI));//순번차이);
		for (Week day : Week.values()) { //배열의 모든 값 가져오기(오른쪽에서 꺼내서 왼쪽에 저장, 다음 줄에서 하나씩 출력.
			System.out.println(day.name());
		}
	}

}
