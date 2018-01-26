package com.Tek;

public class DoWhile {
	public void show(){
		int num1=10;
		int num2=11;
		
		do{
			int num3=num1+num2;
			System.out.println(num3);
			break;
		}while(num1<num2);
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoWhile obj=new DoWhile();
		obj.show();

	}

}
