package modifier.day0112;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		//t.hour = 13; - private으로 직접접근 막혀있고,
		//sethour, 즉 메서드를 통해서 저장해야 함.
		t.setHour(t.getHour() + 1); // 현재시간보다 1시간 후로 변경한다.
		System.out.println(t);
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;

	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}//생성자는 실행만 하도 객체로 올리지 않는다.
	//getter :  변수에 저장된 값을 리턴하는 메서드 
	public int getHour() {
		return hour;
	}
	//setter : 변수에 전달받은 값을 저장하는 메서드
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;}
		this.hour = hour;
	}
	//getter :  변수에 저장된 값을 리턴하는 메서드 
	public int getMinute() {
		return minute;
	}
	//setter : 변수에 전달받은 값을 저장하는 메서드
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}
	//getter :  변수에 저장된 값을 리턴하는 메서드 
	public int getSecond() {
		return second;
	}
	//setter : 변수에 전달받은 값을 저장하는 메서드
	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}
	//아래 의미: 객체 안에 저장되어 있는 값을 하나의 문자열로 만들어주어 리턴한다.
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}








