package practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C4_PrintElementInArray {
	/*
	 * 1. Arrays.asList() 
	 * 2. Arrays.stream() 
	 * 3. Stream.of() 
	 * 4. Traditional for Loop 
	 * 5. Enhanced for loop
	 * 6. Arrays.toString()
	 * 
	 */
	public static void main(String args[]) {
		
		int arrays[] = {1,3,4,2,6};
		
		String array[] = {"One", "Two", "Three"};
		
		Arrays.sort(array);
		
		System.out.println("Method 1:- Arrays.asList(xyz).forEach()");
		Arrays.asList(arrays).forEach(el-> System.out.print(el+", "));
		Arrays.asList(array).forEach(el-> System.out.print(el+", "));
		System.out.println();System.out.println();
		
		System.out.println("Method 2:- Arrays.stream().forRach()");
		Arrays.stream(arrays).forEach(e->System.out.print(e+", "));
		Arrays.stream(array).forEach(e->System.out.print(e+", "));
		System.out.println();System.out.println();
		
		System.out.println("Method 3:- Stream.of(xyz).forRach()");
		Stream.of(arrays).forEach(e->System.out.print(e+", "));
		Stream.of(array).forEach(e->System.out.print(e+", "));
		System.out.println();System.out.println();

		System.out.println("Method 4:- Traditional For loop");
		for(int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i]+", ");
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(arrays[i]+", ");
		}
		System.out.println();System.out.println();

		System.out.println("Method 5:- Enhanced For loop");
		for(int s : arrays) {
			System.out.print(s+", ");
		}

		for(String s : array) {
			System.out.print(s+", ");
		}
		System.out.println();System.out.println();

		System.out.println("Method 6:- Arrays.toString(xyz)");
		System.out.print(Arrays.toString(arrays));
		System.out.print(Arrays.toString(array));
		System.out.println();System.out.println();

		System.out.println("Method 7:- Collectors.joining()");
		String s1 = Arrays.stream(array).collect(Collectors.joining(", "));
		System.out.println(s1);
	}
}
