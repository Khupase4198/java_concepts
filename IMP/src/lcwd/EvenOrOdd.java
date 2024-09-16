package lcwd;

import java.util.*;

public class EvenOrOdd {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:- ");

		int num = scanner.nextInt();
		
//		System.out.println((num % 2 ==0)?"Even Number":"Odd Number");
		
		if (num % 2 == 0) {
			System.out.println(num + " is Even Number");
		} else {
			System.out.println(num + " is Odd Number");
		}
	}
}
