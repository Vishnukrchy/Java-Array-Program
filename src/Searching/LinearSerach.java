package Searching;

import java.util.Scanner;

public class LinearSerach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 2, 3, 4, 5, 3, 2, 2, 5, 20 };
		System.out.println(" Emnter The value want to search ");
		int targetValue = sc.nextInt();
		int indexValue = searchElemnts(a, targetValue);

		if (indexValue >= 0) {
			System.out.println(" Elements is Found At Index " + indexValue);
		} else {
			System.out.println(" Elements is Not  Found !!! ");
		}

	}

	private static int searchElemnts(int[] a, int targetNum) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == targetNum) {
				return i;
			}
		}
		return -1;
	}
}
