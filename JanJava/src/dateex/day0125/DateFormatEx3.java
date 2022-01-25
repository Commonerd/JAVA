package dateex.day0125;

import java.util.*;
import java.text.*;
//String -> Date-> Calendar
class DateFormatEx3 {
	public static void main(String[] args) 	{
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		Date d = null;
		try {
			d = df.parse("2022년 1월 25일");	//DateTimeParseException 발생 가능성
			System.out.println(df2.format(d));
		} catch (Exception e) {
		} 
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
	} // main
}









