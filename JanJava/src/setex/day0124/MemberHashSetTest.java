package setex.day0124;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet mhs = new MemberHashSet();
		
		Member m1 = new Member(1001, "김자바");
		Member m2 = new Member(1002, "이자바");
		Member m3 = new Member(1003, "홍자바");
		
		mhs.addMember(m1);
		mhs.addMember(m2);
		mhs.addMember(m3);
		mhs.addMember(m3);//저장 안 됨 - 인스턴스 주소가 같으면 같은 객체
		
		mhs.showAllMember();
		
		Member m4 = new Member(1003, "홍길동");
		//m3와 m4는 같은 아이디, 같은 이름인데, 또 나옴
		//아이디 값이 같으면 같은 객체라고 만들어주자.
		//
		mhs.addMember(m4);;
		mhs.showAllMember();
	}

}
