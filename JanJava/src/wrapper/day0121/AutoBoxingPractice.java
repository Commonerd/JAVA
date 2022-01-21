package wrapper.day0121;

public class AutoBoxingPractice {
	public static void main(String[] args) {
		int i = 10;
		
		//기본형을 참조형으로 형변환(형변환은 생략이 가능하다)
		Integer intg = i; //Integer intg = Integer.valueOf(i);
		Object o = i; // Object o = (Object)Integer.valueOf(i);
		
		Long lng = 100L; // Long lng = new Long(100L);
		//오토박싱이 가능한 것은 같은 타입끼리만 가능하다. 
		int i2 = intg +10; //참조형과 기본형 간 연산 가능// 인티저를 알아서 언박싱해서 인트로 바꾸어, 인트 10과 더함
		long l = lng +intg; //wrappper 객체간의 연산 가능 // 알아서 언박싱. 알아서 100과 10.
		//unboxing
		int i3 = intg; //int i3 = intg.intValue();
		
		int i4 = 100;
		long l4 = i4;
		
		Integer i5 = 100;
		//Long l5 = i4
		//
	}

}
