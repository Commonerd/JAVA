package stringex.day0121;

public class StringEx1 {
	public static void main(String[] args) {

		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1 == s2);//문자열의 '주소값'을 비교
		System.out.println(s1.equals(s2));//안에 저장되어 있는 '문자열'을 비교 
		//String equals()�� ��ü �ȿ� ����� ���ڿ��� ���Ѵ�.
		
		String s3 = "abc";//문자열의 주소값 저장
		String s4 = "abc";//문자열의 주소값 저장
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.hashCode());//문자열의 주소값
		System.out.println(s2.hashCode());//문자열의 주소값
		System.out.println(s3.hashCode());//문자열의 주소값
		System.out.println(s4.hashCode());//문자열의 주소값
		
		System.out.println(System.identityHashCode(s1));//실제 객체의 주소값
		System.out.println(System.identityHashCode(s2));//실제 객체의 주소값
		System.out.println(System.identityHashCode(s3));//실제 객체의 주소값
		System.out.println(System.identityHashCode(s4));//실제 객체의 주소값
	}
}
