package Simple;

import java.util.Scanner;

public class PrintCountArrayDivisible_By7 {

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

		System.out.println(" All The Element Of Array is : ==============");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(" total count of element is : "+countDigitOf_Array(a));
		
	}
	public static int countDigitOf_Array(int [] a) {
		int count=0;
		 for(int i=0;i<a.length;i++) {
			 if (a[i]%7==0) {
				count++;
				System.out.println(" New Array that element is Divisible by 7 is : "+a[i]);
			}
		 }
		 return count;
	}

}
