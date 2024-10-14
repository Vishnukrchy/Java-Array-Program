package Class;

import java.util.Iterator;
import java.util.Scanner;

public class Q9_ReverseTheArray_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner  sc=new Scanner(System.in);
			System.out.println(" Enter The Size The Array ");
			int n= sc.nextInt();
			int [] a=new int[n];
			for(int i=0;i<a.length;i++) {	
				System.out.println(" Enter the "+(i+1)+" Element Of Array");
				a[i]=sc.nextInt();	
			}
			System.out.println(" Original  Array is : ==============");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			getReverseArray(a);
	}
	public static void getReverseArray(int [] a) {
		System.out.println(" Reverse Array is ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
