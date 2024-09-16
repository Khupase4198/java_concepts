package practice;

import java.util.Arrays;

public class C1_MedianOfArray {

	public static void main(String args[]) {
		int arrays[] = {1, 8, 3};
		int arrays1[] = {12,4,5,9,8,6};
		
		double findMedian = findMedian(arrays1);
		System.out.println("Median:- "+findMedian);
	}
	
	public static double findMedian(int[] array) {
		Arrays.sort(array);
		int n = array.length;
		
 		if(n%2==1) {
			return array[n/2];
		}else {
			return (array[n-1]/2+array[n/2])/2.0;
		}
	}
}
