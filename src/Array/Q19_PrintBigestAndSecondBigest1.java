package Array;

import java.util.Scanner;

public class Q19_PrintBigestAndSecondBigest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int[] a = {12 ,12, 23, 43, 45, 23 ,23 ,54 ,4 };
		System.out.println(" Original Array is ");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println("============================");
		printBigestAndSecondBig(a);
	
	}
	public static void printBigestAndSecondBig(int [] a) {
		int big=a[0];
		int secBig=Integer.MIN_VALUE;// Not Used a[1] bez here if we used a[1] then h1 and h2 might be same 
		for (int i = 0; i < a.length; i++) {
			if (big<a[i]) {
				secBig=big;
				big=a[i];
				
			} else if (a[i]>big && a[i]!=big) {
				secBig=a[i];
			}
		}
		System.out.println(" Bigest Elemnts is "+big);
	if (secBig==Integer.MIN_VALUE) {
		System.out.println(" Second Big Is Does Not Exits");
	} else {
		System.out.println(" Second Bigest Elments is "+secBig);

	}
	}
}
