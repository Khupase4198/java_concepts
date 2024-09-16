package practice;

import java.util.Arrays;

public class C2_CountsWord_Java8 {

	public static void main(String[] args) {
		
		String s = "Iam Learning Java";
		
		long count = Arrays.stream(s.split("\\s+")).count();
		System.out.println("Count of Words in string:- "+count);
	}
}
