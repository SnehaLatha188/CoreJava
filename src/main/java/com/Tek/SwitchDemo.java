package com.Tek;

public class SwitchDemo {
	public void show(){
		int num=8;
		if(num==8){
			switch(8){
			case 7:
			System.out.println("print number 7");
			break;
			case 6:
				System.out.println("print 6");
			break;
			case 5:
				System.out.println("print value is 5");
			break;	
			case 8:
				System.out.println("Print value is 8");
			break;	
			default:
				System.out.println("print default 0");
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchDemo obj=new SwitchDemo();
		obj.show();
		

	}

}
