package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerInput {
	
	public static void main (String args[]) {
		
		/*
		 *  I How to take number input 
		 *  	1. Using Scanner class
		 *  	2. Using Buffer Reader
		 *  	3. Using command line argument (String args[])
		 *   
		 *  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :- ");
		
		int num = sc.nextInt();
//		sc.next()
//		sc.nextLine()
//		sc.nextDouble()
//		sc.nextFloat()
//		sc.nextBoolean()
		System.out.println("The number you have entered is:- "+num);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Input Using BufferedReader ");
		
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(streamReader);
		System.out.println("Enter input using Buffered Reader:- ");
		try {
			String count = br.readLine();
			System.out.println("Entered value :- "+count);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Input Using Command Line Argument ");

	}
}
