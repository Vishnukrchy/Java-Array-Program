package Shorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter the size of array");
		int size = scanner.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + (i + 1) + " elemnts");
			a[i] = scanner.nextInt();
		}
		System.out.println(" Original Array is");
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		getselectionSort(a);
	}
	public static void getselectionSort(int [] a) {
		for (int i = 0; i < a.length; i++) {
			int min =i; int temp=0;
			for (int j = i+1; j < a.length; j++) {
				// search min value
				if (a[min]>a[j]) {
					// Find the Min Value Index;
					min=j;
				}
			}
			// after find minValue Index Swaped with i
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		System.out.println(" Sorted Array is");
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
