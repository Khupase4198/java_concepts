package practice;

import java.util.stream.IntStream;

public class C5_PrintAlternateNumberInArray {

	public static void main(String args[]) {

		int array[] = { 1, 3, 5, 6, 8, 9, 2 };

		System.out.println("For Even position element");
		IntStream.range(0, array.length).filter(i -> i % 2 == 0).map(i -> array[i]).forEach(System.out::println);

		System.out.println("For Even position element");
		IntStream.range(0, array.length).filter(i -> array[i] % 2 == 0).map(i -> array[i]).forEach(System.out::println);

		// IntStream.range(0, array.length):- creates stream of integers from given
		// starting to end point
		// .filter(i->i%2==0) :- filtering only Even integers
		// .map(i->array[i])
	}
}
