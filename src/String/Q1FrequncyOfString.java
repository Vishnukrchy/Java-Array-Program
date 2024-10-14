package String;
//1)WAJP TO PRINT THE FREQUENCHY OF EACH CHARACYERS IN GIVEN STRING ?
import java.util.Scanner;

public class Q1FrequncyOfString {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		getFre(string);

	}

	public static void getFre(String s) {
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
			System.out.println(c[i] + " Is " + count + " Times ");
		}
	}
}
