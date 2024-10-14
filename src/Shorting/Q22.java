package Shorting;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ENter the Element Number: "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println(" Original array is ;");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int [] b =sortHalfArray(a);
		System.out.println(" New sorted array is ");
		for (int x : b) {
			System.out.print(x+" ");
		}
	
		
  }
	public static int[] sortHalfArray(int [] a) {
		int half=a.length/2;
		for(int i=0 ;i<a.length;i++) {
			int x=0;//x/count =0
			for(int j=0;j<half;j++) {
				if (a[j]>a[j+1]) {
					//swaped the position of array
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
					x++;
				}
			}
			
			for(int j=half;j<a.length-1;j++) {
				if (a[j]<a[j+1]) {
					//swaped the position of array
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
					x++;
				}
			}
		 }
		return a;
		}
		
	
}
