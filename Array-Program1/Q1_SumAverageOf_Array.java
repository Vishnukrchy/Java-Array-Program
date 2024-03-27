package Class;

import java.util.Scanner;

public class Q1_SumAverageOf_Array {

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
		getSumAvereageOfArray(a);
	}
	public static void getSumAvereageOfArray(int [] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(" Sum of Array Element is : "+sum);
		System.out.println(" Average of Array Element is : "+(sum/a.length));
	}

}
