package ncs.test;

public class Noodle extends Food{

		public Noodle(){//생성자의 접근제어자는 클래스의 접근제어자와 똑같이 한다.
			super(1000);//나는 super();라고만 했다. 가격 1000을 여기서 해줘야했었다.
		}
		@Override
		public String getName() {
			return "국수";//오버라읻인지 확인해야 하는 이유? 아니라면 빈문자열을 리턴하는 겟 네임이 있고, 얘는 따로 있는 것이다
			// 푸드타입에게 물려받은 메서드를 사용해야 한다.
		}
}
