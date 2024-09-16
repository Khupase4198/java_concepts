package Java8.A1;

public class TestFunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo fd = Test :: testImplementation;
		fd.singleAbstractMethod();
		
		// If no implementation is available in existing 
		// code base then use below code for Lambda Expression
//		FunctionalInterfaceDemo f = ()-> System.out.println("Implementation of SAM");
//		f.singleAbstractMethod();
	}
	 
	class Test{
		public static void testImplementation() {
			System.out.println("This is Test implementation of your abstract method...");
		}
		
	}
}
