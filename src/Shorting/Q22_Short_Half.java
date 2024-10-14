package Shorting;

import java.util.Scanner;

public class Q22_Short_Half {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("ENter the Element Number: " + (i + 1));
			a[i] = sc.nextInt();
		}
		System.out.println(" Original Array is");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("===============");
		int b[] = sortArray(a);
		System.out.println(" New Sorted Array ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println();
		System.out.println("============ Half Shorted Array");
		int h = (b.length - 1);// half index array
		for (int i = 0; i < b.length; i++) {
			if (i < b.length / 2) {
				System.out.print(a[i] + " ");
			} else {
				System.out.print(a[h] + " ");
				h--;
			}
		}
	}

	public static int[] sortArray(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i < n; i++) {
			int x = 0;// x/count =0
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					// swaped the position of array
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
					x++;
				}
			}
			if (x == 0) {
				break;
			}
		}
		return a;
	}
}
