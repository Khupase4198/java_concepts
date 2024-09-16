package IQ;

import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter input String:- ");
		String str = scan.next();
		char[] charArray = str.toCharArray();
		System.out.println("Reverse String using Iterative Method:- ");
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();

		System.out.println("Reverse String using String Buffer or  String Builder:- ");
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);

		System.out.println("Reverse String using Recursive Merhod- ");
		String recursiveMethod = recursiveMethod(str);
		System.out.println(recursiveMethod);

		System.out.println("Reverse String using Java Stream :- ");
		String revString = Stream.of(str.split("")).reduce((a,b)->b+a).orElse("");
		System.out.println(revString);
	}

	public static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
