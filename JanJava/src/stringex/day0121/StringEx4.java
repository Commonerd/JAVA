package stringex.day0121;

public class StringEx4 {
	public static void main(String[] args) {

		String rainbow = "red,orange,yellow,green,blue,navy,purple";
		
		String[] color = rainbow.split(",");
		for(String s : color) {
			System.out.println(s);
		}
		
		String colors = String.join("+", color);//주의필요 배열을 합쳐줄때 문자열을 집어 넣어서, 하나의 문자로 합쳐서 출력.
		System.out.println(colors);
		
		System.out.println(rainbow);//원본은 바뀌지 않는다.
	}

}
