package mapex.day0125;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> map
		= new HashMap<String, String>();
		map.put("myId","1234");//key, value
		map.put("asdf","1111");
		map.put("asdf","1234");//기존에 있던 키로 똑같은 키로 저장. 
		//중복되면 안되니, 그 전에 있는 밸류 값을 바꿔버린다.
		//System.out.println(map);
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력하세요.");
			System.out.println("id : ");
			String id = s.next();
			
			System.out.println("password : ");
			String password = s.next();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력하세요.");
				continue;
			} else {
				if(map.get(id).equals(password)) {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");;
				}
				
			}
		}
		s.close();
	}

}
