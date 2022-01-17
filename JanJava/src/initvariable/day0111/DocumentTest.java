package initvariable.day0111;

//파일 저장시 이름이 없으면 제목없음n
//있으면 지정한 이름.
class Document {
	static int count = 0;
	String name; // 문서명(Document name)

	public Document() { // 문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
		// this는 같은 클래스 안에 있는 '생성자'를 의미한다.
		// 생성자의 매개변수가 String 타입인 것은 바로 아래에 Document(String name)이기 때문에 아래로 가는 것이다.
	}

	public Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

class DocumentTest {
	public static void main(String args[]) {
		Document d1 = new Document();// 제목없음1
		Document d2 = new Document("자바.txt");// 문서 자바.txt가 생성되었습니다.
		Document d3 = new Document();// 제목없음2
		Document d4 = new Document();// 제목없음3
	}
}
