package Array;

import java.util.Scanner;

public class StrictlyIncresing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The Size Of Array");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter " + (i + 1) + " elements");
			a[i] = scanner.nextInt();
		}
		System.out.println(checkStrictlyIncresingorder(a));;
	}

	private static boolean checkStrictlyIncresingorder(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
for (int j = 0; j < a.length-1-i; j++) {
	if (a[j]>a[j+1]) {
		return false;
	} 
	
}
		}
		return true;

	}
}
