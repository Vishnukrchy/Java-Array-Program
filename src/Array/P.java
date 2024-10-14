package Array;

import java.util.Scanner;

public class P {
static	Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	
	
	int [] a= {2,4,5,64,3,6,3,2};
	System.out.println(" Before the insert Array is ");
	for (int i : a) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	System.out.println(" Enter The Index That u want insert new elemnts");

	
     int [] b=	insertArrayElemnts(a, sc.nextInt());
     System.out.println(" After Inset array is ");
	for (int i : b) {
		System.out.print(i+" ");
	}
	
}
public static int[] insertArrayElemnts( int [] a,int b) {
	for (int i = 0; i < a.length; i++) {
		if (i==b) {
			a[i]=sc.nextInt();
		}
	}
	return a;
}
}
