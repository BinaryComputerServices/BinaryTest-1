package main;

import java.util.Calendar;

public class BinaryMain {

	/**
	 * I'm confident this will work
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("This is working the way I want.");
		Object obj = null;
		Lottery l = new Lottery();
		if(l instanceof Player){
			((Player) l).getAge();
		}
	}
	System.out.println("winner!");
	

}


