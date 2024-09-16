package lcwd;

import java.util.*;

public class PercentageGrades {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Physics Marks:- ");
		int physics = sc.nextInt();

		System.out.println("Enter Chemistry Marks:- ");
		int chemistry = sc.nextInt();

		System.out.println("Enter Biology Marks:- ");
		int biology = sc.nextInt();

		System.out.println("Enter Mathematics Marks:- ");
		int maths = sc.nextInt();

		System.out.println("Enter Computer Marks:- ");
		int computer = sc.nextInt();

		Double percentage = (double) (((physics + chemistry + biology + maths + computer) / 500.0) * 100);
		System.out.println("Percentage:- " + percentage);

//		if (percentage >= 90) {
//			System.out.println("Grade A");
//		} else if (percentage >= 80 && percentage < 90) {
//			System.out.println("Grade B");
//		} else if (percentage >= 70 && percentage < 80) {
//			System.out.println("Grade C");
//		} else if (percentage >= 60 && percentage < 70) {
//			System.out.println("Grade D");
//		} else if (percentage >= 40 && percentage < 60) {
//			System.out.println("Grade E");
//		} else if (percentage < 40) {
//			System.out.println("Grade F");
//		}
		String returnGrade = returnGrade(percentage);
		switch (returnGrade) {
		case "A": 
			System.out.println("Grade A");
			break;
		case "B": 
			System.out.println("Grade B");
			break;
		case "C": 
			System.out.println("Grade C");
			break;
		case "D": 
			System.out.println("Grade D");
			break;
		case "E": 
			System.out.println("Grade E");
			break;
		case "F": 
			System.out.println("Grade F");
			break;
		default:
			System.out.println("Unexpected Percentage Value");
		}
	}

	public static String returnGrade(Double percentage) {
		if (percentage >= 90) {
			return "A";
		} else if (percentage >= 80 && percentage < 90) {
			return "B";
		} else if (percentage >= 70 && percentage < 80) {
			return "C";
		} else if (percentage >= 60 && percentage < 70) {
			return "D";
		} else if (percentage >= 40 && percentage < 60) {
			return "E";
		} else {
			return "F";
		}
	}
}
