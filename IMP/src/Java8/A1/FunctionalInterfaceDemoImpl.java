package Java8.A1;

public class FunctionalInterfaceDemoImpl implements FunctionalInterfaceDemo, FunctionalInterfaceDemo2{

	@Override
	public void singleAbstractMethod() {
		// TODO Auto-generated method stub
		
	}


	// If we have 2 default methods in two different interfaces implemented by single class
	// then we have to override the same method with Interfacename.super()
	@Override
	public void printFirstName() {
		// TODO Auto-generated method stub
		FunctionalInterfaceDemo.super.printFirstName();
	}
	
	// with static method in Interface we can not override it in all the implementations like default method
	// you have to call it by using Interface name
	public static void main(String[] args) {
		FunctionalInterfaceDemo.staticMethod();
	}
	
	
}
