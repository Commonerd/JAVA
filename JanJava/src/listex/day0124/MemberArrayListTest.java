package listex.day0124;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberList = new MemberArrayList();
		
		Member m1 = new Member (1001, "김자바");
		Member m2 = new Member (1002, "이자바");
		Member m3 = new Member (1003, "최자바");
		Member m4 = new Member (1004, "박자바");
	
		//memberList에 4명 회원 추가(하나씩)
		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		memberList.addMember(m4);
		
		//전체 회원 출력
		memberList.showAllMember();
		
		//1002번 회원 삭제
		memberList.removeMember(1002	);
		
		//전체 회원 출력
		memberList.showAllMember();

	}

}
