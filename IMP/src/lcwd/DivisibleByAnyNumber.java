package lcwd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class DivisibleByAnyNumber {

	public static void main(String args[]) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number:- ");
//		int num = sc.nextInt();
//
//		if (num % 7 == 0)
//			System.out.println(num + " is divisible by 7");
//		else
//			System.out.println(num + " is not divisible by 7");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:- ");
		int num = sc.nextInt();
		
		int x = 10;
		int y = 80;
		
//		Comparator<Integer> com = (x, y) -> x.compareTo(y);
		
		BiConsumer<Integer, Integer> biconsumer = (a, b)-> System.out.println(a+b); 
biconsumer.accept(10, 30);		
//		System.out.println((num%5==0 && num%11==0)? "Divisible by 5 and 11":"Not Divisible by 5 and 11");
		
		if(num % 5==0 && num %11==0)
			System.out.println("Divisible by 5 and 11");
		else
			System.out.println("Not Divisible by 5 and 11");
			
	}

}
