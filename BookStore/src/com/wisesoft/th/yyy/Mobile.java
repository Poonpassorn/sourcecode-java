package com.wisesoft.th.yyy;

public interface Mobile {
	void call();

	void playMusic();
}

//แบบที่ 1 interface Mobile2018 extends Mobile ** จะง่ายแต่จะผูกมัดกัน เป็น multi inheritance
//แบบที่ 2 interface NewMobileV2 extends Mobile,Mobile2018 **ได้ type ใหม่เป็น  multi inheritance ผูกมัด 1,2
/* แบบที่ 3 
 * interface NewMobile {
 * void call();
 * void playMusic();
 * void takePhoto();
 * }*/ 


interface Mobile2018 { // เพิ่มแบบนี้เพื่อลดผลกระทบ
	void takePhoto();
}

interface NewMobileV2 { 
	void call();
	void playMusic();
	void takePhoto();
}

class Sumsung implements Mobile {
	@Override
	public void call() {
	}
	@Override
	public void playMusic() {
	}
}

class Iphone implements NewMobileV2 {
	@Override
	public void call() {
	}
	@Override
	public void playMusic() {
	}
	@Override
	public void takePhoto() {
	}
}