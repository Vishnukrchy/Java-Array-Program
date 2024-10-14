package Array;

import java.util.Scanner;

public class Q18_RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int[] a = {12 ,12, 23, 43, 45, 23 ,23 ,54 ,4 };
		System.out.println(" Original Array is ");
		for (int i : a) {
			System.out.print(i+" ");
		}
	System.out.println();
		
		int newArr [] =getUniqeElement(a);
		System.out.println(" Uniqe Array is ");
		for (int i : newArr) {
			System.out.print(i+" ");
		}

	}

	public static int[] getUniqeElement(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i <= n; i++) {
			int count = 1;
			for (int j = i + 1; j <= n; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = a[n];

					n--;
					j--;
				}
			}	
		}
		int [] newArr=new int[n];
		for (int i = 0; i <n; i++) {
			newArr[i]=a[i];
		}
		return newArr;
		
	}
}
