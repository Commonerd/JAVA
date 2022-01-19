package com.mytest.test02_220119;

public class Radio implements Volume {
	
	int	volLevel;
//	public Radio() {}; => 안해도 됨
	public void volumeUp(int level) {
		
			volLevel += level;
			System.out.println("Radio볼륨 올립니다."+volLevel);
	}
	
	public void volumeDown(int level) {
		
			volLevel -= level;
			System.out.println("Radio볼륨 올립니다."+volLevel);
	}
	
	
	
}
