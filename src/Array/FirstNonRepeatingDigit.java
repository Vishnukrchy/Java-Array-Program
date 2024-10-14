package Array;

public class FirstNonRepeatingDigit {
	public static void main(String[] args) {
		int a[] = { 1, 1, 3, 23, 1, 3, 2 };
		System.out.println(getFirstNonReaptingDigit(a));
		;
	}

	private static String getFirstNonReaptingDigit(int[] a) {
		int n = a.length;
		for (int i = 0; i < a.length; i++) {
			int digit = a[i];
			int j;
			for (j = 0; j < a.length; j++) {
				if (i != j && digit == a[j]) {
					break;
				}
			}
			if (j == n) {
				return "first non reapting digit " + digit + " At index Of " + i;
			}
		}
		return "first non reapting digit Not Found ";
	}
}
