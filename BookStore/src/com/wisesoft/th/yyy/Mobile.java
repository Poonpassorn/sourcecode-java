package com.wisesoft.th.yyy;

public class Mobile {
	void call() {
		System.out.println("Call");
	}

	void playMusic() {

	}

}

class Sumsung extends Mobile {

}

class Iphone extends Mobile {

	@Override
	void call() {
		// TODO Auto-generated method stub
		super.call();
	}

	@Override
	void playMusic() {
		// TODO Auto-generated method stub
		super.playMusic();
	}

}