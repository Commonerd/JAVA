package dateex.day0125;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

class DateFormatEx1 {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		Locale e_locale = new Locale("en");
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");//2022-01-25
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일", e_locale);//'22년 Jan 25일 Tue요일
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//2022-01-25 14:54:28.597
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");//2022-01-25 02:54:28 오후

		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");//오늘은 올 해의 25번째 날입니다.
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");//오늘은 이 달의 25번째 날입니다.
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");//오늘은 올 해의 5번째 주입니다.
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");//오늘은 이 달의 5번째 주입니다.
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");//오늘은 이 달의 4번째 화요일입니다.

		System.out.println(sdf1.format(today)); // format(Date d)
		System.out.println(sdf2.format(today)); 
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println();
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
	}
}