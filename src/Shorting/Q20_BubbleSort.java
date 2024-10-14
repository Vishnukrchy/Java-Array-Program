package Shorting;

import java.util.Scanner;

public class Q20_BubbleSort {
  public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);		
		System.out.println( " Enter The Size Of Array Is : ");
		int n =sc.nextInt();
		int [] a= new int[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.println(" Enter The Array "+(i+1)+" Element ");
			a[i]=sc.nextInt();
		}
	 System.out.println(" Original  Array Element Is : ");
	 for(int i=0;i<a.length;i++) {
		 System.out.print(a[i]+" ");
	 }
	 System.out.println();
	 // Create a New Array To store The Sorted Array Element
	 int [] b=bubbleSortArray(a);
	 System.out.println(" Bubble Sort Array is : ");
	 for (int i : b) {
		System.out.print(i+" ");
	}
}
  public static int[] bubbleSortArray(int [] a) {

	int n=a.length-1;
	for(int i=0;i<n;i++){
		int count=0;
		for(int j=0;j<n-i;j++){
			if(a[j]<a[j+1]){
				a[j]=a[j]+a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
				count++;
			}
		}
		if(count==0)
			break;
	}
	return a;
	  
}
}
