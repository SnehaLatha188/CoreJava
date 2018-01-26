package com.Tek;

public class IfDemo{
	static int num1 = 10;
	static int num2 = 20;
public void display(int num1,int num2){
	if(num1<num2)
	{
		System.out.println("Print num1 is less tha num2");
	}

	if(num2>num1)
	{
		System.out.println("Print num2 is greater than num2");

	}num1=num1*2;
	if(num1==num2)
	{
		System.out.println("Print num1=num2");
	}
	if (num1>num2){
		System.out.println("prnit num1 is not greater than num2");
	}
}
	public static void main(String []args){
		IfDemo obj= new IfDemo();
		obj.display(10,20);
		
		
	}
}
