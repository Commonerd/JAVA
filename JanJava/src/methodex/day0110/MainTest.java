package methodex.day0110;

public class MainTest {
//StackOverflowError => 재귀호출이 어디선가 돌고 있고, 제대로 못 끝냈다는 의미. 
	public static void main(String[] args) {
		main(null);
	}

}
