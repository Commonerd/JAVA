package com.mytest.test02_220119;

public class VolTest {

	public static void main(String[] args) {
//		Volume[]v = new Volume[3];
//		v[0] = new Speaker();
//		v[1] = new Radio();
//		v[2] = new TV();
		Volume[] v = {new Speaker(), new Radio(), new Tv()}; // 위에는 4줄, 이건 1줄 간결하니 이렇게 하자.
		for(int i = 0; i<v.length; i++) {
			for (int j= 1; j<=3;j++) {
				v[i].volumeUp(200);// 
			}
			for(int j=1; j<=3;j++) {
				v[i].volumeDown(300);
			}
		}
	}
}

