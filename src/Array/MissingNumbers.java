package Array;

import java.awt.desktop.AboutEvent;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The size Array ");
		int a[] = new int[scanner.nextInt()];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			
		}
		// Step 1 we Need To Sort the Array 
		Arrays.sort(a);
		System.out.println("=============================");
		misssingNoumber(a);

	}
	public static void misssingNoumber(int a[]) {
		 int nextExp, nextAct;

	        // Loop through the array
	        for (int i = 0; i < a.length - 1; i++) {
	            nextExp = a[i] + 1;  // Expected next number
	            nextAct = a[i + 1];  // Actual next number in array

	            // While there are missing numbers between nextExp and nextAct
	            while (nextExp < nextAct) {
	                System.out.println(nextExp);  // Print the missing number
	                nextExp++;  // Move to the next number
	            }
	        }
	}
}
