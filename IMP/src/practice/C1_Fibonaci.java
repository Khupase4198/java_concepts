package practice;

public class C1_Fibonaci {

	// Series of numbers where each number is sum of 2 preceding numbers
	// 0,1,1,2,3,5,8,13,21
	public static void main(String[] args) {

		int n = 10;
		int fN = 0;
		int sN = 1;
		for (int i = 0; i <= n; ++i) {
			System.out.print(fN+", "); //0, 1, 1, 2, 3, 5, 8 
			int temp = fN + sN; // 1, 2, 3, 5,
			fN = sN;            // 1, 1, 2, 3,
			sN = temp;          // 1, 2, 3, 5,
		}
	}
}
