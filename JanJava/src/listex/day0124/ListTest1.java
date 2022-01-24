package listex.day0124;

import java.util.*;// all

public class ListTest1 {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		//저장할 수 있는 공간 10개가 생겼다.
		sList.add("A");
		sList.add("b");
		sList.add("C");
		sList.add("d");
		
		System.out.println(sList);
		System.out.println();
		for(int i = 0; i <sList.size(); i++) {
			System.out.println(sList.get(i));
		}//사이즈만큼 뽑아내는 것
		System.out.println();
		for(String s : sList) {
			System.out.println(s);
		}//foreach문으로 다 뽑아내는 것.
		
	}

}
