package listex.day0124;

import java.util.*;

public class LinkedListEx2 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long start; //nano단위의 시간
		long end; 
		
		start = System.nanoTime();//시스템상의 현재 시간을 나노시간 값으로
		for(int i = 0; i <10000; i++) {
			list1.add(0,"a");
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : "+(end-start));
		
		start = System.nanoTime();//시스템상의 현재 시간을 나노시간 값으로
		for(int i = 0; i <10000; i++) {
			list2.add(0,"a");
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : "+(end-start));
		
		//데이터베이스에서 뽑아오면 변경된 내용이 거의 없음
		//웹개발은 ArrayList가 대부분. 
	}

}
