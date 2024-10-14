package Array;

import java.util.Scanner;
// WAJP TO PRINT THE MAX Feq ELEMENTS IN ARRAY 
public class MaxFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 2, 4, 5,5,5, 64, 3, 6, 3, 2 };
//		System.out.println(" Enter The Size Of array");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(" Enter the " + (i + 1) + " Elements of Array");
//			a[i] = sc.nextInt();
//		}
		System.out.println(" =======================================================");
		getcount(a);
		System.out.println(" =======================================================");
	

	}

	public static void getcount(int[] a) {
		int n = a.length - 1;
		int targertValues=0;
		int maxFreq=0;
		for (int i = 0; i <= n; i++) {
			int count = 1;
			for (int j = 1 + i; j <= n; j++) {
				if (a[i] == a[j]) {
					a[j] = a[n];
					count++;
					j--;
					n--;
				}
			}if (count>maxFreq) {
				maxFreq=count;
				targertValues=a[i];
			}
			
		}
		System.out.println( " The Elemnts is "+targertValues+" Is Highest Times");
		System.out.println(targertValues+" is Max Freq is "+maxFreq);
	}

	
	}

