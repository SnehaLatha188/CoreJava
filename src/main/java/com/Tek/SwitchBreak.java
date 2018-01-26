package com.Tek;

public class SwitchBreak {
	public void missingBreak(){
		for (int num=6;num>0;num--){
			
			switch(num){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Print value is 5");
				break;
			case 7:
				System.out.println("Print value is 6");
			    break;
				default:
					System.out.println("Value is 0");
					
				}
			}
		}
	public static void main(String[]args){
		SwitchBreak obj=new SwitchBreak();
		obj.missingBreak();
	}
	}


