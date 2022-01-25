package dateex.day0125;

import java.util.*;
import java.text.*;

class DateFormatEx4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd"; 
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner s = new Scanner(System.in);
		//String타입을 Date타입으로 바꿔준다.
		Date inDate = null;

		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2021/05/11)");

		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());//공백을 넣을 수 있기 떄문에 줄 통째로. 
				break;
			} catch(Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2021/05/11)");
			}
		} // while

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
        long t = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
		
		System.out.println("입력하신 날짜는 현재와 "+ Math.abs(t) +"시간 차이가 있습니다.");
		s.close();
	} // main
}








