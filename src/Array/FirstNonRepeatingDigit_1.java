package Array;

import java.io.NotActiveException;
import java.util.Iterator;

public class FirstNonRepeatingDigit_1 {
	public static void main(String[] args) {
		int a[] = { 1, 1, 3, 23, 1, 3, 2 };
		System.out.println(getFirstNonReaptingDigit(a));
		;
	}

	private static String getFirstNonReaptingDigit(int[] a) {
	int n=a.length-1;
	for (int i = 0; i <=n; i++) {
		int count=1;
		for (int j = i+1; j <=n; j++) {
			
			if (a[i]==a[j]) {
				count++;
			}
		}
		if (count==1) {
			return "First Non-repeating digit is : "+a[i]+" at "+i+" index";
		}
	}
	return " Not available";
	}
}
