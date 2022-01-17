package inheritance.day0111;
//이름(Name)은 성(family)와 이름(name)으로 이루어져 있다.
//이름 클래스 만들고 포함관계로 맺어주기
class Name{
	String family;
	String name;
	
	Name(){}//생성자 만들기. 나는 실수해서 안만듦

	Name(String family, String name) {
		this.family = family;
		this.name = name;
	}
	@Override
	public String toString() {//인스턴스 변수 - 클래스명 다르고, 리턴타입 유
		return "Name [family=" + family + ", name=" + name + "]";
	}
}