package Array;
//WAJP TO DELETE  ELEMNT OF AN ARRAY  ON CERTAIN POSITUON OF ARRAY
// I/P  a ={2,34,4,3,2,22};
// O/P  index 2 a= {2,34,3,2,22}
import java.util.Iterator;
import java.util.Scanner;

public class DeleteElement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 64, 3, 6, 3, 2 };
		System.out.println(" ORIGINAL Before the insert Array is ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(" Enter The Index That u want DELETE new elemnts");
		int position = sc.nextInt();

		System.out.println(" After  the insert Array is ");
		int[] b = remove(a, position);
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static int[] remove(int[] k, int position) {

		int newArray[] = new int[k.length - 1];

		for (int i = 0; i < k.length; i++) {
			if (i < position) {
				newArray[i] = k[i];
			} else if (i>position) {
				newArray[i-1]=k[i];
			}
			
		}

		return newArray;
	}
}
