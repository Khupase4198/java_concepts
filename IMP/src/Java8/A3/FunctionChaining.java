package Java8.A3;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionChaining {
	public static void main(String[] args) {
		Function<Integer, Integer> squareMe = i -> i * i;
		System.out.println(squareMe.apply(5));
		

		Function<Integer, Integer> doubleMe = d -> d * 2;
		System.out.println(doubleMe.apply(6));

		System.out.println(squareMe.andThen(doubleMe).apply(8));
		System.out.println(doubleMe.andThen(squareMe).apply(8));

		System.out.println(squareMe.compose(doubleMe).apply(8));
		System.out.println(doubleMe.compose(squareMe).apply(8));
	}
}
