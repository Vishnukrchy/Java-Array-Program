package Simple;

import java.util.Scanner;

public class Count_DigitOf_Array {

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
		System.out.println(" Total Element Of Array is "+countDigitOf_Array(a));
	}
	public static int countDigitOf_Array(int [] a) {
		int count=0;
		for (int x : a) {
			count ++;
			System.out.println(" =====================");
			System.out.println("Array is : "+x);
		}
		return count;
	}

}
