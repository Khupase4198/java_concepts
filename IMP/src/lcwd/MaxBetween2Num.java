package lcwd;

import java.util.*;
public class MaxBetween2Num {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:- ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number:- ");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("First number is bigger");
		}else {
			System.out.println("Second number is bigger");
			
		}
	}
}
