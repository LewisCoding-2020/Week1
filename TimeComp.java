//**********************************************************
//	Java				Author: Tracy
//						Date: July 8, 2020
//**********************************************************

import java.util.Scanner;

public class TimeComp {
//This program prompts for the user for a number and then converts into hours, minutes and seconds.
	
	public static void main(String[] args) {

		int number;
		int timeHours;
		int timeMinutes;
		int timeSeconds;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		
		timeHours = number / 3600;
		timeMinutes = (number % 3600) / 60;
		timeSeconds = number % 60;
		
		System.out.print(timeHours + " hours " + timeMinutes + " minutes " + timeSeconds + " seconds");
		
		scan.close();
		

	}

}
