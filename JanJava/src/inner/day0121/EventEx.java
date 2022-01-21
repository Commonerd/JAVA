package inner.day0121;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx {

	public static void main(String[] args) {
		Frame f = new Frame();//창을 만듦
		Panel p = new Panel();
		Button b = new Button("push1");
		Button b1 = new Button("push2");
		
		b.addActionListener(new ActionListener() {//생성자인가 했더니 괄호가 더 있다면 익명 이너클래스. 
			//그 안에 있는 메서드 실행. 
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭 by inner");
			}
			
		});
		b1.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		//두 번째 버튼을 클릭하면 "hello"가 출력되도록 익명클래스 작성

		p.add(b);
		p.add(b1);
		f.add(p);
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);//끄려면 터미네이트, 또는 작업관리자>세부정보>javaw 종료
	}

}

class EventHandler implements ActionListener{
//버튼을 클릭할 때마다(event) 호출되는 메서드

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌렸습니다.");
	}
	
}
