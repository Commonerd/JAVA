package setex.day0124;
import java.util.TreeSet;
import java.util.Iterator;
public class MemberTreeSet {
	

	
		private TreeSet<Member> TreeSet;

		public MemberTreeSet() {
			TreeSet = new TreeSet<Member>();

		}

		// 멤버 추가 addMember
		public void addMember(Member m) {
			TreeSet.add(m); //equals(), hashcode()
		}

		// 멤버 삭제 removeMember
		public boolean removeMember(int memberId) {
			Iterator<Member> it = TreeSet.iterator();
			while (it.hasNext()) {
				Member m = it.next();
				if (m.getMemberId() == memberId) {
					TreeSet.remove(m);
					return true;

				}
			}
			System.out.println("맞는 아이디 없음");
			return false;
		}

		// 모든 멤버 출력 showAllMember
		public void showAllMember() {
			for (Member m : TreeSet) {
				System.out.println(m);
			}
			System.out.println();
		}
}

