package forex.day0106;

public class MultiForEx4 {
	/*
	 * 2와 100사이에 있는 모든 소수를 찾는 프로그램 작성하세요. (소수는 1과 자신 이외에 약수 가지지 않아야 한다.) 현재 정수에서작해
	 * 100사이에 약수가 하나라도 있으면 소수가 아니다. 약수는 % 연산자를 이용하여 검사할 수 있다. 즉, i가 5의 약수라면 i%5가 0이
	 * 된다.
	 */

	public static void main(String[] args) {

		int count = 0; // 나머지 값이 0이 나오는

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				} // if
			} // inner for
			if (count == 1) {
				System.out.println(i);
			}
			count = 0; // count 초기화
		} // outer for
	}
}