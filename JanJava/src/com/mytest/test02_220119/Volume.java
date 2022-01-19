package com.mytest.test02_220119;

interface Volume {
	public abstract void volumeUp(int level);
	public abstract void volumeDown(int level);
//	int level = 0; //불필요
//	void volumeUp(int level); //OK
//	void volumeDown(int level);//OK
}
