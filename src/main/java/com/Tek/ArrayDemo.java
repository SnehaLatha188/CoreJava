package com.Tek;

public class ArrayDemo {
public void display(){
	final String days_Week[];
	days_Week = new String[7];
	days_Week[0]= "Monday";
	days_Week[1]="Tuesday";
	days_Week[2]="Wednesday";
	days_Week[3]="Thursday";
	days_Week[4]="Friday";
	days_Week[5]="Saturday";
	days_Week[6]="Sunday";	
	System.out.println("Days in a week are" + days_Week[6]);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo obj = new ArrayDemo();
		obj.display();

	}

}
