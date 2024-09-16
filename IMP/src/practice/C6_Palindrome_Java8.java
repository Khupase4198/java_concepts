package practice;

public class C6_Palindrome_Java8 {

	public static void main(String[] args) {

		int num = 453;
		int r, temp, sum = 0;

		temp = num;

		while (num > 0) {
			r = num % 10;  // 4, 5, 4
			sum = (sum * 10) + r; // 4, 45, 454 
			num = num / 10; // 45
		}

		if (temp == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}
}
