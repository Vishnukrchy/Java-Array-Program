package Class;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
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
}
}
