package listex.day0124;

import java.util.*;

//Iterator : 컬렉션의 요소를 읽어오는 방법을 표준화한 인터페이스
//ListIterator
//Enumeration :Iterator의 구버전

public class IteratorEx {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//list.trimToSize();
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {//다음 객체가 있는지 체크
			System.out.println(iter.next()); // 커서가 다음 객체로 넘어가 객체를 가져온다.
			//iter.remove();//커서가 가리키는 해당 지점을 지운다.
			//원본데이터의 컬렉션을 지운다. 
		}	
		System.out.println("size() : "+list.size());
	}

}
