package listex.day0124;

import java.util.*;

public class StackEx1 {

	public static Stack<String> back = new Stack<>();// 뒤로 가기

	public static Stack<String> forward = new Stack<>();// 앞으로 가기

	public static void main(String[] args) {
		goURL("1.싸이월드");
		goURL("2.네이버");
		goURL("3.github");
		goURL("4.구글");

		printStatus();

		goBack();
		System.out.println("= 뒤로 가기 버튼 =");
		printStatus();

		goBack();
		System.out.println("= 뒤로 가기 버튼 =");
		printStatus();

		goForward();
		System.out.println("= 앞으로 가기 버튼 =");
		printStatus();

		goURL("codechobo.com");
		System.out.println("= 새로운 URL 입력 =");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("현재 페이지 : " + back.peek());//스택의 주요 메서드
		System.out.println();
	}

	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty())
			forward.clear();
	}

	public static void goForward() {
		if (!forward.empty())
			back.push(forward.pop());
	}

	public static void goBack() {
		if (!back.empty())
			forward.push(back.pop());
	}
}
