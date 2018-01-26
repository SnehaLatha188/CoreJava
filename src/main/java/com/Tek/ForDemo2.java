package com.Tek;

public class ForDemo2 {
	public void calculate(){
		int num1, num2;
		for(num1=10,num2=14;num1<num2;num1++,num2--){
			System.out.println("print value num1=" + num1);
			System.out.println("print value num2=" + num2);
			
		}
		
		}
	public static void main(String[]args){
		ForDemo2 obj=new ForDemo2();
		obj.calculate();
	}

}
