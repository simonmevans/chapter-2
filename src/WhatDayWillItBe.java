import java.util.*;
public class WhatDayWillItBe {
	static String convertNumberToDay(int x) {
		if(x==0)
			return "Sunday";
		if(x==1)
			return "Monday";
		if(x==2)
			return "Tuesday";
		if(x==3)
			return "Wenesday";
		if(x==4)
			return "Thursday";
		if(x==5)
			return "Friday";
		return "Saturday";
		
	}
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Today is Sunday");
		System.out.println("Enter a number and I will tell you what day that will be");
		int day = input.nextInt();
		String dayName = convertNumberToDay(day%7);
		System.out.println("That will be on a " + dayName);
		
	}
}
