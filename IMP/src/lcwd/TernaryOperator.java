package lcwd;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num:- ");
		int n1 = sc.nextInt();
		System.out.println("Enter second num:- ");
		int n2 = sc.nextInt();
		
		int max = n1 > n2 ? n1 :n2;
		System.out.println("Max number is "+max);
	}
}
