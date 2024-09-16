package Java8.A5;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

	/*	
	 * - Supplier<R> -> It only just supply required objects and will
	 * not take any input
	 * - Its always going to supply never consume/take any input.
	 * 
	 * No chaining as no input is given to it. Only it gives you output
	 * 
	*/
	
	public static void main(String[] args) {
		// Without supplier
		SupplierFunctionalInterface supply = new SupplierFunctionalInterface();
		System.out.println("Todays date is : "+supply.giveCurrentDate());
		
		Supplier<Date> supplier = () -> new Date();
		System.out.println("Todays date is (Supplier) : "+supplier.get());
		
	}
	
	public Date giveCurrentDate() {
		return new Date();
	}
}
