package Class;

import java.util.Scanner;

public class Q4_Print_CountThreeDigitNumberOf_Array {

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
			getThreeDigitNumberArray(a);
	}
	public static void getThreeDigitNumberArray(int [] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if (a[i]==100 ||a[i]==999) {
				count++;
				System.out.println( " Three Digit Element Is : " +a[i]);
			}
		}
	}

}
