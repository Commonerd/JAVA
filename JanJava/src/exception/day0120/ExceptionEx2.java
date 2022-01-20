package exception.day0120;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// Run > Run Config. > arguments에 임의 값 입력.
		try {
			int data = Integer.parseInt(args[0]);
			// 문자열을 받아서, 인트로 바꾼 다음에, parse한다.
			// 스트링 타입을 인트타입으로 바꿔주는 메서드다.
			// Integer.parseInt의 기능: '숫자로 이뤄진 문자열만' 바꿀 수 있다.
			int result = 50 / data;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("값을 입력해주세요");
		} catch (NumberFormatException | ArithmeticException ae) {
			System.out.println("0이 아닌 숫자만 입력할 수 있습니다.");
		} catch (Exception e) {// 슈퍼타입은 아래에 적어준다.
			System.out.println("예외가 발생했습니다.");
		} // 위에 있으면 안됨. 슈퍼타입이라 그거 끝내고 뒤에 실행 안됨
		// 캐치 쓰고 모든 타입 에러 지정할 필요 없다. 조상타입(Exception)을 선언하면
		// 편하게 작성 가능하다. .  
		
		System.out.println("프로그램 종료");
	}
}

//ArrayIndexOutOfBoundsException -처음
//NumberFormatException - 5A
//ArithmeticException - 0
//멀리플캐치가 필요한 시점.