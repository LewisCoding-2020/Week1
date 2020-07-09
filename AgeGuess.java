//**********************************************************
//	Java				Author: Tracy
//						Date: July 8, 2020
//**********************************************************

import java.util.Scanner;

public class AgeGuess {
//This program prompts for the users name and age.

	public static void main(String[] args) {
		
		String name;
		int ageGuess;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Enter your age: ");
		ageGuess = scan.nextInt();
		
		scan.close();
		

	}

}
