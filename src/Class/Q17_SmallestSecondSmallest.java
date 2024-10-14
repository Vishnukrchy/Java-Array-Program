package Class;

import java.util.Scanner;

public class Q17_SmallestSecondSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size Of Array Is : ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter The Array " + (i + 1) + " Element ");
			a[i] = sc.nextInt();
		}
		System.out.println(" All Array Element Is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		checkSmallestSecondSmallest(a);

	}

	public static void checkSmallestSecondSmallest(int[] a) {
		int smallest = a[0];
		int seccondsmallest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				seccondsmallest = smallest;
				smallest = a[i];

			} else if (a[i] < seccondsmallest) {
				seccondsmallest = a[i];
			}

		}
		System.out.println(" smallest Element Of Array is : " + smallest);
		System.out.println("Second smallest Element Of Array is : " + seccondsmallest);

	}
}
