package arrayex.day0106;
//A반 학생 성적은 79, 88, 91, 33, 100, 55, 95이다.

//배열에 저장 후 최고점, 최저점을 출력하세요.

public class ArrayEx4 {

	public static void main(String[] args) {
		char[] aScore = { 79, 88, 91, 33, 100, 55, 95 };
		int max = 79;
		int min = 79;

		for (int i = 1; i < aScore.length; i++) {
			int value = aScore[i];
			if (max < value) {//밸류값이 맥스보다 크다면,
				max = value;//맥스에 새로운 밸류값을 저장. => 최댓값으로..
			};
			if(min > value) {//밸류값이 민보다 작다면
				min = value;//민에 새로운 밸류값을 저장 => 최솟값으로..
			}
		}//for
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min);
	}
}
