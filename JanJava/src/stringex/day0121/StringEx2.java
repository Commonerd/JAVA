package stringex.day0121;

public class StringEx2 {
	public static void main(String[] args) {
		String filename = "hello.java";//알파벳별 인덱스 번호: 0123456789
		int index = filename.indexOf(".");//5
		String name = filename.substring(0, index);//0,5//hello
		String ext = filename.substring(index+1);//6//java

		System.out.println(
				filename+"의 파일명은 "+name+"이고 확장자는 "+ext+"입니다.");
		
		String abc = "abc";
		System.out.println(abc.indexOf("Z"));//-1 
		if(abc.indexOf("Z") == -1) {
			System.out.println(abc+"에 해당 글자 없음");
		}
			
	}
//코딩테스트 1,2번으로 자주 나온다. 문자열 짜르는 문제.
} 
