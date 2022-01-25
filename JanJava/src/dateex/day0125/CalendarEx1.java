package dateex.day0125;

import java.util.Calendar;

class  CalendarEx1{
	public static void main(String[] args) 	{
		String sb = "2022년중 ";
		Calendar now = Calendar.getInstance();//객체생성
		int week_yy = now.get(Calendar.WEEK_OF_YEAR);
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1;//1월이 0을 기억한다.
		int dd = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%s %d번째 주, %d년 %d월 %d일",
				sb, week_yy, yy,mm,dd);
	}
}








