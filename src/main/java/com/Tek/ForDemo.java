package com.Tek;

public class ForDemo {
	//public static int num;
	public void display(){
		//for(num=10;num>0;num--)
		for(int num=10;num>0;num=num-1){
			System.out.println(num);
		   
		}
		
	}
	public static void main(String []args){
		ForDemo obj =new ForDemo();
		obj.display();
		
	}

}
