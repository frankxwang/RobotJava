package com.Robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Paste {
	public static void main(String[] args) throws Exception{
		float per = 0.01f;
		int time = 10;
		Thread.sleep(5000);
		Robot r = new Robot();
		for(int i=0; i<time/per; i++){
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_V);
			Thread.sleep((long) (1000/8*per));
			r.keyRelease(KeyEvent.VK_META);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep((long) (1000/8*per));
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep((long) (1000/8*per));
			r.keyRelease(KeyEvent.VK_META);
			r.keyRelease(KeyEvent.VK_A);
			Thread.sleep((long) (1000/8*per));
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_C);
			Thread.sleep((long) (1000/8*per));
			r.keyRelease(KeyEvent.VK_META);
			r.keyRelease(KeyEvent.VK_C);
			Thread.sleep((long) (1000/8*per));
			r.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep((long) (1000/8*per));
			r.keyRelease(KeyEvent.VK_LEFT);
			Thread.sleep((long) (1000/8*per));
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
