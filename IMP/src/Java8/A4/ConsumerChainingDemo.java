package Java8.A4;

import java.util.function.Consumer;

public class ConsumerChainingDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing square root : "+i*i);
		squareMe.accept(10);
		
		Consumer<Integer> doubleMe = d -> System.out.println("Taking an input and doubling it : "+d*2);
		doubleMe.accept(20);
		
		squareMe.andThen(doubleMe).accept(5);
		
		doubleMe.andThen(squareMe).accept(7);
	
		// Consumer does not have compose method
//		doubleMe.compose(squareMe).accept(7);
	}
}
