package Array;

public class ShiftZeroAnd1 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 0, 0, 1, 1, 1, 0 };
		System.out.println(" Original Array is ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(" New Array  is ");
		a = shift0And1(a);
		for (int i : a) {
			System.out.println(" this is executed");
			System.out.print(i + " ");
		}
	}

	public static int[] shift0And1(int[] a) {
		int a2[] = new int[a.length];
		int count1 = 0;
             
		for (int i = 0; i < a2.length; i++) {
			if (a[i] == 1) {

				count1++;
			}
			for (int j = a2.length; count1 > 0; j--) {
				a[i] = 1;
			}
		}
		return a2;

	}
}
