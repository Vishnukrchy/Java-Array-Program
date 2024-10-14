package Array;

public class ThreeDigitArrayElemnts {
	public static void main(String[] args) {
		int[] a = { 22, 4, 235, 264, 3, 6, 32, 2 };
		getdigit(a);
	}

	public static void getdigit(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 99 && a[i] <= 999) {
				System.out.println(" The Theee digit Elemets  Is " + a[i]);
			}
		}
		System.err.println();
		System.out.println();
	}
}

