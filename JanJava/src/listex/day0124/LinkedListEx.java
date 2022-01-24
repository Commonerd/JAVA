package listex.day0124;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("a");
		myList.add("b");
		myList.add("c");
		
		System.out.println(myList);
		
		myList.add(1,"D");
		System.out.println(myList);
		myList.addFirst("0");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}//추가되는 내용이 많고, 삭제되는 내용도 많다면 LinkedList가 유리하다. 

}
