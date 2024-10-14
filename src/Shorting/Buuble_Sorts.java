package Shorting;

import java.util.*;

public class Buuble_Sorts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("ENter the Element Number: " + (i + 1));
			a[i] = sc.nextInt();
		}
		int[] b = sort(a);
		System.out.println("Sorted elements: ");
		for (int x : b) {
			System.out.print(x + "  ");
		}
	}

	public static int[] sort(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i <=n; i++) {
			int x = 0;
			for (int j = 0; j <n - i; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
					x++;
				}
			}
		}
		return a;
	}

}
