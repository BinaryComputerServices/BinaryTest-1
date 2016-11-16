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
		while(true){
			obj.getClass().toString();//find bugs should find null reference
			Calendar cal = Calendar.getInstance();
		}
	}
	

}


