package arrayex.day0106;

public class ObjArrayEx3 {

	public static void main(String[] args) {// args 비어있는 배열.주소값은 저장이 된다.

		if (args.length > 0) {
			for (String s : args) {
				System.out.println(s);
			}
		} else {
			System.out.println("입력한 값이 없습니다.");
		}

	}
}