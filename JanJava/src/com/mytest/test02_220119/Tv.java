package com.mytest.test02_220119;

public class Tv implements Volume{
	
	int	volLevel;
//	public TV() {}; => 스킵가능
	public void volumeUp(int level) {
		
			volLevel += level;
			System.out.println("TV볼륨 올립니다."+volLevel);
	}
	
	public void volumeDown(int level) {
		volLevel -= level; //실수1: 증감식과 이프식을 거꾸로 했음
		if( volLevel < 0) { //실수2: volLevel이 아니라 level로 했음
			volLevel = 0;//실수3: volLevel이 아니라 level로 했음
		}
			
			System.out.println("TV볼륨 내립니다."+volLevel);
	}
	
}

