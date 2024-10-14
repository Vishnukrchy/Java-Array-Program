package Array;

// WAJP TO FIND THE FREQUENCY OF EACH ARRAY ELEMENTS 
import java.util.Scanner;

public class ContFrequencyOfEachElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size Of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter the " + (i + 1) + " Elements of Array");
			a[i] = sc.nextInt();
		}
		System.out.println(" =======================================================");
		getcount(a);
		System.out.println(" =======================================================");
		getFrequncy(a);

	}

	public static void getcount(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i <n; i++) {
			int count = 1;
			for (int j = 1 + i; j <=n; j++) {
				if (a[i] == a[j]) {
					a[j] = a[n];
					count++;
					j--;
					n--;
				}
			}
			System.out.println(a[i] + " is  " + count + " Times");
		}
	}

	public static void getFrequncy(int[] a) {
		int n = a.length;
		for (int i = 0; i < n-1; i++) {
			int count = 1;
			for (int j = 1 + i; j < n; j++) {
				if (a[i] == a[j]) {
					a[j] = a[n - 1];
					count++;
					j--;
					n--;
				}
			}
			System.out.println(a[i] + " is  " + count + " Times");
		}
	}
	
}
