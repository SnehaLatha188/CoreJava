package com.Tek;

public class ForEachDemo {
	public void show(){
		int numbers[]={11,12,13,14,15};
		int summation=0;
		for(int index:numbers){
			System.out.println("print:"+numbers);
			summation +=index;
			System.out.println("print:"+summation);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForEachDemo obj=new ForEachDemo();
		obj.show();

	}

}
