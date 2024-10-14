package Array;
//4)WAJP TO PRINT THE ALL THE CHARCTES IN STRING WHICH APEARED THE EVEN NO OF TIMES IN THE GIVEN STRING 
import java.util.Scanner;

public class EvenNoChar {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		evenNoChar(string);

	}

	public static void evenNoChar(String s) {
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
			if (count %2==0 ) {
				System.out.println(" The Enven No Char In Given string is " + c[i]);
			}
		}
	}
}
