package setex.day0124;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<Member>();

	}

	// 멤버 추가 addMember
	public void addMember(Member m) {
		hashSet.add(m); //equals(), hashcode()
	}

	// 멤버 삭제 removeMember
	public boolean removeMember(int memberId) {
		Iterator<Member> it = hashSet.iterator();
		while (it.hasNext()) {
			Member m = it.next();
			if (m.getMemberId() == memberId) {
				hashSet.remove(m);
				return true;

			}
		}
		System.out.println("맞는 아이디 없음");
		return false;
	}

	// 모든 멤버 출력 showAllMember
	public void showAllMember() {
		for (Member m : hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
}