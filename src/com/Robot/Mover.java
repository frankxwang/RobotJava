package com.Robot;

import java.awt.*;
import java.util.*;

public class Mover {

	public static void main(String[] args) throws Exception {
		float per = 0.01f;
		int time = 5;
		ArrayList<int[]> coords = new ArrayList<int[]>();
		for(int i=0; i<time/per; i++){
			Point p = MouseInfo.getPointerInfo().getLocation();
			int[] coord = {p.x, p.y};
			coords.add(coord);
			System.out.println("record");
			Thread.sleep((long) (1000*per));
		}

		Robot r = new Robot();
		for(int i=0; i<coords.size(); i++){
			int[] coord = coords.get(i);
			r.mouseMove(coord[0], coord[1]);
			System.out.println("do");
			Thread.sleep((long) (1000*per));
		}
	}

}
