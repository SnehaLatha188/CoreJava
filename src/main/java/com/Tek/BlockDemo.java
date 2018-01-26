package com.Tek;

public class BlockDemo {
	private int num1;
	private int num2;
	public void show(){
		for(num1=0;num1<10;num1++){
			num2=20;
			num2=num2+2;
	
			System.out.println(" Print num1 is " + num1);
			System.out.println(" print num2 is " + num2);
		}
		
	}
	public static void main(String []args){
		BlockDemo obj=new BlockDemo();
		obj.show();

	}

}
