package generic.day0124;

public class GenericEx1Main {

	public static void main(String[] args) {

			GenericEx1<String> t = new GenericEx1<String>();
			
			String[] sArr = { "A","B","C"};
			t.set(sArr);
			t.print();
			
	
	GenericEx1<Integer> i = new GenericEx1<>();
	Integer [] iArr = {1,2,3};
	
	i.set(iArr);
	i.print();
	
//컬렉션은 객체들을 모아 저장하는 것
//좌항에 있는 것 그대로 사용한다면, 우항 제네릭 안에 타입입력을 생략할 수 있다. 
//다이아몬드 연산자라고 부르는 곳도 있다. <>
//코드가 엉킬 이유가 없어진다.
	}
}
