package Java8.A1;

public interface FunctionalInterfaceDemo2 {

	default void printFirstName() {
		System.out.println("Akshay");
	}
	
	// We are not allowed to override Object class's default methods as default methods in interface
	// else will get compilation error
	// All implementing classes by default has access to all methods of object class
//	default int hashCode() {
//		return 3*2;
//	}
}
