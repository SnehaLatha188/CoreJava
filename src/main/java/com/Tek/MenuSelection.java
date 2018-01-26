package com.Tek;
public class MenuSelection {
	

	public void show() throws java.io.IOException{
	 char choose;
		do{
			System.out.println("choose one:");
			System.out.println("1.Egg");
			System.out.println("2.milk");
			
			choose =(char) System.in.read();
		}while(choose < '1'||choose >'2');
		
		System.out.println("\n");
		switch(choose){
		case '1':
			System.out.println("choose egg");
			break;
		case '2':
			System.out.println("choose milk");
			break;
		}
			
		
		
		}
	public static void main(String[]args)
		throws java.io.IOException{
		MenuSelection obj=new MenuSelection();
		obj.show();
	}
		
	}
	


