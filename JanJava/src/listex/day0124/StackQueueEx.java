package listex.day0124;

import java.util.*;

public class StackQueueEx {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Queue<String> q = new LinkedList<String>();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		while(!q.isEmpty()) {//비어있지 않으면 뽑아온다.
			System.out.println(q.poll());
		}//저장된 순서과 출력 순서가 같다.
		
		stack.push("0");
		stack.push("1");
		stack.push("2");

		while(!stack.empty()) {
			System.out.println(stack.pop());
		}//저장된 순서와 출력된 순서가 반대
		
	}//저장된 순서가 출력된 순서 결과물 비교

}
