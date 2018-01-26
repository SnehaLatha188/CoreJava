package com.Tek;

public class Array3Demo {
	public void display(){
	final int num[]= {1,2,3};
	final int sum= num[0]+num[1]+num[2];
	final int averageValue= sum/3;
	
		System.out.println("Average of 3 numbers is:"+averageValue );
	
	}
	public static void main(String[]args){
		Array3Demo obj= new Array3Demo();
		obj.display();
		}                              
	

}
