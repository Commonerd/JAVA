package langex.day0121;

class Person {
	long personId;// 주민등록번호

	public Person(long personId) {
		this.personId = personId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return personId == ((Person) obj).personId;
		}
		return false;// Person이 아닌 다른 타입의 객체라면 다른 거!!
	}

}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(2201013123456L);
		Person p2 = new Person(2201013123456L);
//new에서 주소할당받고, 멤버 메모리에 올리고
//new에서 주소할방받고, 멤버 메모리에 올리고
		if (p1 == p2) {// 등가비교연산자로 체크해봄
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}

		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}

	}
}
