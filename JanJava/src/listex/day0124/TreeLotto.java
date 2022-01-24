package listex.day0124;

import java.util.TreeSet;

public class TreeLotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		for(; lotto.size() <6;) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);// 중복값(10,10) 이렇게 나오면 add 메서드가 알아서 제거
		}
		
		System.out.println(lotto);
	
	}
}