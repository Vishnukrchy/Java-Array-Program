package Array;
import java.util.Iterator;
// WAJP TO INSERT NEW ELEMNT OF AN ARRAY  ON CERTAIN POSITION OF ARRAY
import java.util.Scanner;

public class insertElment {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 64, 3, 6, 3, 2 };
		System.out.println(" ORIGINAL Before the insert Array is ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(" Enter The Index That u want insert new elemnts");
		int position = sc.nextInt();
		System.out.println(" Enter The Index Values That u want insert new elemnts");
		int values = sc.nextInt();

		System.out.println(" After  the insert Array is ");
		int[] b = insert(a, position, values);
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		sc.nextLine();
		insertElements(b, position, values);

	}

	public static int[] insert(int[] k, int position, int value) {

		int newArray[] = new int[k.length + 1];
		newArray[position]=value;
		for (int i = 0; i < k.length; i++) {
			if (i<position) {
				newArray[i]=k[i];
			} else  if(i>=position){
				newArray[i+1]=k[i];

			}
		}

		return newArray;
	}
	 public static int [] insertElements(int[] k ,int position ,int value) {
		  int newArray [] = new int[k.length+1];
		  newArray[position]=value;
		  
		    for(int i=0; i<newArray.length-1;i++) {
		    	if (i<position) {
					newArray[i]=k[i];
				}  else if (i>=position) {
					newArray[i+1]=k[i];
				} 
		    }
		    System.out.println(" From the Second method ");
		   for (int i : newArray) {
			System.out.print(i+" ");
		}
		    return newArray;
		
	}
}
