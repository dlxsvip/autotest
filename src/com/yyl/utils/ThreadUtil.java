package com.yyl.utils;

public class ThreadUtil {

	public static void sleep(long t) {

		try {
			Thread.sleep(t * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
