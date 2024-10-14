package YuTube;

import java.util.Scanner;

public class FindLastOccuranceOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		System.out.println(" Enter The Size The Array ");
		int n= sc.nextInt();
		int [] a=new int[n];
		
//	
		for(int i=0;i<a.length;i++) {	
			System.out.println(" Enter the "+(i+1)+" Element Of Array");
			a[i]=sc.nextInt();	
		}
		
	
		System.out.println(" All The Element Of Array is : ==============");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		check_OcuuranceOf_X(a);
	}
	public static void check_OcuuranceOf_X(int [] a) {
		System.out.println(" Enter The VALUE OF X ");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		for(int i=0; i<a.length;i++) {
			if (a[i]==x) {
				count++;
			}
		}
		System.out.println(" Occurance Of "+x+ " in this array is "+count+" Times");
	}

}
