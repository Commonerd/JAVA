package forex.day0105;

public class ForEx8 {
//for문을 이용해 1부터 누적해서 합계를 구하다가
	//합이 300이 넘으면 중지하고 그때까지의 합과
	//마지막으로 더해진 값을 구하는 코드를작성.
	//(출력 결과: 합은 325이고 마지막으로 더해진 수는 25이다.)
	public static void main(String[] args) {
		int i = 1;
		int sum = 0; //변수 sum 설정시 0으로. 
		
		for (;;i++) { //조건식 생략한 이유는 아래에 break을 했기 때문이다. 
			sum += i;
			if(sum >300)  {break;}
		}
		System.out.printf("합은 %d이고 마지막으로 더해진 수는 %d이다.", sum, i);
	}
}