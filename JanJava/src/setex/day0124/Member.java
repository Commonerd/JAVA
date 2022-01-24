package setex.day0124;

import java.util.Objects;

public class Member implements Comparable<Member> {

	private int memberId;
	private String memberName;
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는"+memberId+"입니다.";
	}
	
	//회원의 아이디가 같으면 같은 객체. 소스 > generate hashcode and equals
	
	@Override
	public int hashCode() {//해시코드와 트리셋은 중복제거
		return memberId;//회원 아이디값을 반환
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {//obj를 멤버타입으로 바꿔야 한다. 
			return memberId == ((Member)obj).memberId; 
		}
		return false;
	}
	@Override
	public int compareTo(Member o) {	//컴페어는 정렬 기준
		return (memberId - o.memberId)* -1;
	}
	

}
