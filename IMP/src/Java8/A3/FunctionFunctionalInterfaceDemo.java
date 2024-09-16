package Java8.A3;

import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo {

	/*
	 * It is also a Predefined Functional Interface with only one abstract method
	 * only abstract method is apply(T t)
	 * 	- R apply(T t)
	 * Given some input performs some operation on input and then produce/return result (Not necessary a boolean value)
	 * This takes 1 input and returns one output
	 * In Predicates we used to take one input and return type us always Boolean
	 * In Function return type is not fixed hence we declare both input type and return type
	 * 
	*/
	public static void main(String[] args) {
		// without Function
		FunctionFunctionalInterfaceDemo fDemo = new FunctionFunctionalInterfaceDemo();
		System.out.println(fDemo.squareInt(5));
		
		// With function
		Function<Integer, Integer> squareMe = i -> i*i;
		System.out.println(squareMe.apply(6));
	}
	
	public int squareInt(int i) {
		int square = i*i;
		return square;
	}
}
