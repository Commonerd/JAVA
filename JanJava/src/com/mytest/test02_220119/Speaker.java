package com.mytest.test02_220119;

public class Speaker implements Volume {

	int volLevel;
//	public Speaker() {}; =>안적어도 상관은 없다.

	@Override //오버라이드는 우클릭 소스에서 생성가능!
	public void volumeUp(int level) {
		volLevel += level; //실수1: 나는 여기서증감식과 이프식 순서를 뒤바꿨다. 
		if (volLevel > 100) { //실수2: 나는 여기서 볼레벨을 그냥 레벨로 해버렸다. 
			volLevel = 100; //실수3: 볼레벨을 그냥 레벨로 해버렸다.
		}
		System.out.println("Speaker볼륨 올립니다." + volLevel);
	}

	@Override
	public void volumeDown(int level) {

		volLevel -= level;
		if (volLevel < 0) { //정답1: 실수2,3과 다르게 여기서는 제대로 했다.
			volLevel = 0; //정답2: 실수2,3과 다르게 여기서는 제대로 했다.
		}
		System.out.println("Speaker볼륨 내립니다." + volLevel);
	}

}
