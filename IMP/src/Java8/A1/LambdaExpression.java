package Java8.A1;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaExpression {

	public static void main(String[] args) {
		/*
		 *  Lambda expression is a anonymous function 
		 *  Without name, return type and access modifier 
		 *  having only -> lambda symbol
		*/
		LambdaExpression lambda = new LambdaExpression();
		int a = 5;
		int b = 6;
		// without lambda
		int c = lambda.add(a,b);
		
		// with lambda
		// BiConsumer is a Predefined Functional Interface
		BiConsumer<Integer, Integer> biConsumer= (m, n)->System.out.println(m + n);
		biConsumer.accept(a, b);
		
		// Comparator is a functional Interface
		Comparator<String> comp = (s1, s2)->s1.compareTo(s2);
	}
	
	public int add(int a, int b) {
		return (a+b);
	}
}
