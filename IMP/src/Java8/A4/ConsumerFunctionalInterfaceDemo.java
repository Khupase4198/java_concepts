package Java8.A4;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo {

	/**
     * - Predicate<T> takes 1 input and returns boolean always
     * - Function<T, R> takes 1 input and 1 return type produced after 
     * performing some operation on input
     * - Consumer<T> - It will consume item. Consumers never return 
     * anything(never supply) , they just consume
     * 
     */
	public static void main(String[] args) {
		ConsumerFunctionalInterfaceDemo cons = new ConsumerFunctionalInterfaceDemo();
		
		//without consumer
		cons.squareMe(4);
		
		// with consumer
		Consumer<Integer> con = i -> System.out.println("Square using consumer for given number is "+i*i);
		con.accept(6);
		
	}
	public void squareMe(int i) {
		int square = i*i;
		System.out.println("Square of given number is : "+square);
	}
}
