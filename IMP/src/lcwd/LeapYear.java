package lcwd;

import java.util.Scanner;

public class LeapYear {

	public static void main(String args[]) {

		System.out.println("Enter year:- ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		boolean b = leapYear(year);
		
//		System.out.println(b ? "Leap Year":"Not a Leap Year");
		
		if (b) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
	}

	private static boolean leapYear(int year) {
		// A year is a leap year if it is divisible by 4
		if (year % 4 == 0) {
			// But if it is also divisible by 100, it is not a leap year unless it is divisible by 400
			if (year % 100 == 0) {
				return year % 400 == 0;
			}
			return true;
		}
		return false;
	}
}
