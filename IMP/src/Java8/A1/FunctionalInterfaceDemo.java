package Java8.A1;

//@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void singleAbstractMethod();

//	void singleAbstractMethod1();
	
	default void printFirstName() {
		System.out.println("Akshay");
	}

	default void printLastName() {
		System.out.println("Patil");
	}
	
	static void staticMethod() {
		System.out.println("Static method example...");
	}
}
