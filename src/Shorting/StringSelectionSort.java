package Shorting;

import java.util.Scanner;

public class StringSelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Size Of String array: ");
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < s.length; i++) {
			System.out.println("ENter the Element Number: " + (i + 1));
			s[i] = sc.next();
		}
		System.out.println(" Original String is");
		for (String string : s) {
			System.out.print(string + " ");
		}
		System.out.println();
		getStringArraySort(s);
	}

	public static void getStringArraySort(String[] s) {
		for (int i = 0; i < s.length; i++) {
			int min = i;
			String tempString = "";
			for (int j = i + 1; j < s.length; j++) {
				// check the condition it retrun 1then min value index is find else its retrun -1
				if (s[j].compareTo(s[min]) < 0) {
					min = j;
				}
			}
			// swaped
			tempString = s[i];
			s[i] = s[min];
			s[min] = tempString;

		}
		System.out.println(" New Arraay");
		for (String string : s) {
			System.out.print(string + " ");
		}
	}
}
