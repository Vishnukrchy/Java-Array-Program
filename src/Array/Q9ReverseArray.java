package Array;

import java.util.Scanner;

public class Q9ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size The Array ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter the " + (i + 1) + " Element Of Array");
			a[i] = sc.nextInt();
		}
		System.out.println(" Original  Array is : ==============");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		getReverseArray(a);
	}

	private static void getReverseArray(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i < n/2; i++) {
			int temp = a[i];
			a[i] = a[n - i];
			a[n - i] = temp;

		}
		System.out.println(" Reverse Array is =====================  ");
		for (int i : a) {
			System.out.print(i + " ");
		}

	}
}
