package String;

import java.util.Scanner;

//2)WAJP TO PRINT THE ALL THE NON REPEETED CHARCTERS OF THE STRING?
public class Q2 {
public static void main(String[] args) {
	System.out.println("Enter the string ");
	Scanner sc = new Scanner(System.in);
	String string = sc.next();
	nonReaprtingCharcters(string);

}
public static void nonReaprtingCharcters(String s) {
	char[] c = s.toCharArray();
	int n = c.length - 1;
	for (int i = 0; i <= n; i++) {
		int count = 1;
		for (int j = i + 1; j <= n; j++) {
			if (c[i] == c[j]) {
				count++;
				c[j] = c[n];
				j--;
				n--;
			}
		}
		if (count==1) {
			System.out.println(" The Non reaption fd charcter   is " + c[i]);
		}
	}
}
}
