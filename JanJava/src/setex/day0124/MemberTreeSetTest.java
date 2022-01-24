package setex.day0124;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet mts = new MemberTreeSet();
		
		Member m1 = new Member(1001, "김자바");
		Member m2 = new Member(1002, "이자바");
		Member m3 = new Member(1003, "홍자바");
		
		mts.addMember(m3);
		mts.addMember(m1);
		mts.addMember(m2);
	
		
		mts.showAllMember();
	} //트리셋까지 사용하면 정렬의 기준까지 .
//해시코드와 트리셋은 중복제거
//컴페어는 정렬 기준
}
