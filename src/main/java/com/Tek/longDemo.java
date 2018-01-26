package com.Tek;

public class longDemo {
	private int numdays = 365;
	private int Millennium = 10000;
	private long hours;
	private long numdecade;
	public void show(){
		numdecade=numdays*Millennium;
		hours=numdays*Millennium*8760;
		System.out.println(" No.of days and hours in Millennium " + numdecade +" "+  hours);
	}
	public static void main(String[] args){
		longDemo obj = new longDemo();
		obj.show();
		
	}
	

}
