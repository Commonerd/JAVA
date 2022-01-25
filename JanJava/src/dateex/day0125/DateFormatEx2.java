package dateex.day0125;

import java.util.*;
import java.text.*;
class DateFormatEx2{
	public static void main(String[] args) 	{
		// Calendar와 Date간의 변환은 다음과 같이 한다.
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 3, 27);	// 2022년 4월 17일 - Month는 0~11의 범위를 갖는다.

		Date day = cal.getTime();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd"); //2022-04-27
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");//22-04-27 수요일
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//2022-04-27 15:05:37.591
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");//2022-04-27 03:05:37 오후

		System.out.println(sdf1.format(day)); // format(Date d)
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));

	}
}
