package com.Robot;

import java.awt.*;
import java.awt.event.InputEvent;

public class Autoclick {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		float per = 0.05f;
		int time = 10;
		Thread.sleep(5000);
		Robot r = new Robot();
		for(int i=0; i<time/per; i++){
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep((long) (1000*per));
		}
	}

}
