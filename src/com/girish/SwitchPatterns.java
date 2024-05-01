package com.girish;

public class SwitchPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//JDK12 version
		/*
		 * String day ="Monday"; switch(day) { case "Monday","Tuesday" ->
		 * System.out.println("6 AM"); case "Wednesday" -> System.out.println("7 AM");
		 * default ->System.out.println("8 AM");
		 */
		
		
		//JDK17 version
		String day ="Friday";
		String result="";
		result=	switch(day) {
		case "Monday","Tuesday" :yield  "6AM";
		case "Wednesday" : yield	"7 AM";			
		default :yield "8 AM";
		};
		
		System.out.println("result="+result);
	}

}
