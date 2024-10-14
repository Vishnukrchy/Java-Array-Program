package Searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 2, 3, 4, 5, 3, 2, 2, 5, 20 };
		System.out.println(" Emnter The value want to search ");
		int targetValue = sc.nextInt();
		int index=searchElemnts(a, 0, a.length-1, targetValue);

		if (index >= 0) {
			System.out.println(" Elements is Found At Index " + index);
		} else {
			System.out.println(" Elements is Not  Found !!! ");
		}


	}

	public static int searchElemnts(int[] a, int low, int high, int target) {
		int mid = low + high;

		if (a[mid] == target) {
			return mid;

		} else if (low > high) {
			return -1;
		} else if (a[mid] > target) {
		 return	searchElemnts(a, low, mid - 1, target);
		} else {
		return	searchElemnts(a, mid + 1, high, target);
		}

	}
}
