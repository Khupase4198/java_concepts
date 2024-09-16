package lcwd;

import java.util.Scanner;

public class ElecttricityUnit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Electricity Unit");
		int unit = sc.nextInt();
		double charges = 0.0;
		if (unit <= 50) {
			charges = 0.50;
		} else if (unit > 50 && unit <= 100) {
			charges = 0.75;
		} else if (unit > 100 && unit <= 200) {
			charges = 1.20;
		} else {
			charges = 1.50;
		}
		
		double bill = unit * charges;
		double surCharge = (20/100.0)*bill;
		double finalBill = bill + surCharge;
		System.out.println("Electricity bill is:- "+finalBill);
	}
}
