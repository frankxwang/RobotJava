package com.Robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Typer {

	public static void main(String[] args) throws Exception {
		String[] strs = {"hello", "spam...", "spam!", "more spam!"};
		Robot r = new Robot();
		Thread.sleep(5000);
		for(int aa=0; aa<80; aa++){
			for(int i=0; i<strs.length; i++){
				String s = strs[i];
				char[] cs = s.toCharArray();
				for(int j=0; j<cs.length; j++){
					char c = cs[j];
					int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
					r.keyPress(keyCode);
					r.keyRelease(keyCode);
				}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
			Thread.sleep(10);
		}
	}
}
