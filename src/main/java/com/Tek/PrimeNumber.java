package com.Tek;

public class PrimeNumber {
	boolean value;
	public void calculation(int num){
		value=false;
		for(int num2=5;num2<= num/num2;num2++){
			if((num%num2)==0){
				System.out.println("notprime");
				value=false;
				break;
				
			}
			else System.out.println("is prime");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj=new PrimeNumber();
		obj.calculation(43);
	}

}
