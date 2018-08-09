package com.wisesoft.th.yyy;

import java.util.Random;

public class RandomNumber {

	/*แบบนี้ผิด ห้ามใช้ new Object
	 * public int genarateNumber() {
		Random random = new Random(); 
		return random.nextInt(10);
	}*/
	public int genarateNumber(Random random) {
		return random.nextInt(10);
	}
}
