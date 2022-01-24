package listex.day0124;

import java.util.ArrayList;
import java.util.Iterator;

import setex.day0124.Member;

public class MemberArrayList {// 회원명부
	private ArrayList<Member> arrayList;

	// 어레이 리스트타입의 변수를 하나 선언
	// Member객체만 저장하고 있는 리스트를 쓰겠다고 선언
	// private을 통해 직접 저장은 막아준다.
	// 얘는 인스턴스 변수니까 생성자 필요
	public MemberArrayList() {
		arrayList = new ArrayList<>();
		// ArrayList<Member> => 여기서 '멤버' 생략가능
		// 멤버를 추가하려면? 멤버객체를 받아와서 arrayList에 저장하고 끝내면 된다.
		// 저장하고 끝낼 것이니 리턴값 필요없다. void붙여줌. 하단참고.
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

//Member객체 arrayList 저장
//멤버 추가
	// 멤버 삭제 - id값을 받아와서 일치하는 값이 있으면 remove, 없으면 "메세지 출력
	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member m = arrayList.get(i);
			// i번에 있는 인덱스를 꺼내와서, 변수 m에 저장.
			// 그런 후 if
			if (memberId == m.getMemberId()) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println("맞는 아이디 없음");
		return false;
	}

	// 전체 회원 출력
	public void showAllMember() {
//		for(Member m : arrayList) {
//			System.out.println(m);
//		}//이터레이터를 통해 다 꺼내오는 것으로 바꿔주기.
//		System.out.println();
		Iterator<Member> ir = arrayList.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println();

	}
}