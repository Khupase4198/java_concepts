package Java8.A2;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample {

	/*
	 * - Predicate is a predefined Functional Interface (Having only one abstract method) 
	 * - The only abstract method of predicate is test(T t);
	 * 		public boolean test(T t);
	 * - Whenever we want to check some boolean condition then you can go for predicates
	*/
	
	/*
	 *  Input to predicate can be anything Predicate<String>, Integer, Employee
	 *  Hence only one type argument is required which is input type in predicate
	 *  Return type is not required as its always Boolean only
	*/
	public static void main(String[] args) {
		// With predicate
		Predicate<String> predicate = str -> str.length() >= 5;
		System.out.println("Length of given word is grater than 5 "+predicate.test("Abc"));
		
		
		// Without predicate
		PredicateFunctionalInterfaceExample pre = new PredicateFunctionalInterfaceExample();
		System.out.println("Length of word is grater than 5 "+pre.returnStringLength("Abc"));
	}
	
	public boolean returnStringLength(String s) {
		if(s.length()>=5) {
			return true;
		} else {
			return false;
		}
	}
}
