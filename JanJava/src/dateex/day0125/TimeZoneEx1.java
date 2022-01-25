package dateex.day0125;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneEx1 {

	public static void main(String[] args) {
		//전세계 timezone 출력
		for(String t : TimeZone.getAvailableIDs()) {
			System.out.println(t);
		}
		//원하는 timezone 세팅
		TimeZone.setDefault(TimeZone.getTimeZone("Moscow"));
		
		Calendar cal = Calendar.getInstance();//Calendar is abstract. 
		Date date_Mowcow = cal.getTime();
		System.out.println(date_Mowcow);
		
	}
}