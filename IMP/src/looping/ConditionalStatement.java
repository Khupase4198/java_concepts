package looping;

public class ConditionalStatement {

	public static void main(String args[]) {

		int a = -2;

		// Single if
		if (a == 10) {
			System.out.println("Success one");
		}

		// if - else
		if (a > 0) {
			System.out.println("Success two");
		} else {
			System.out.println("false two");
		}

		// nested if else
		if (a > 0 && a < 10) {
			System.out.println("Success three");
		} else if (a > 10) {
			System.out.println("Success four");
		} else {
			System.out.println("false three");
		}
	}
}
