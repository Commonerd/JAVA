package forex.day0106;

public class Game369 {
//1부터 100까지 1씩 증가하면서 숫자에 3,6,9가 들어갈 떄마다
//숫자와 함꼐 "짝!"을 출력하는 프로그램을 작성하세요. *for와 if 이용.
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i <= 9) { // 1의 자리인 애들
				if (i % 3 == 0) {
					System.out.println(i + "짝!!");
				} else {
					System.out.println(i);
				}
			} else { // 10에 자리에 3,6,8; 1에 자리에 3,6,9
				int first = i / 10; // 십의 자리
				int second = i % 10; // 일의 자리

				if (first % 3 == 0) {
					System.out.println(i + "짝!!");
				} else if (second % 3 == 0 && second != 0) {
					System.out.println(i + "짝!!");
				} else {
					System.out.println(i);
				} // if end
			} // for end
		}
	}
}