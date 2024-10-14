package Class;

public class Shift02 {
	public static void main(String[] args) {
		int[] a = { 2, 0, 0, 0, 2, 1, 1, 0, 2, 1 };
		int [] b=shift(a);
		for (int i : b) {
			System.out.print(i+" ");
		}
	}

	public static int[] shift(int[] a) {
		int count2 = 0;
		int count0 = 0;
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count0++;
			} else if (a[i] == 2) {
				count2++;
			}
			b[i] = 1;
		}
		for (int i = 0; i < b.length; i++) {
			if (count0 > 0) {
				b[i] = 0;
				count0--;
			}
			if (count2 > 0) {
				b[i] = 2;
				count2--;
			}
		}
		return b;

	}
}
