package Class;

import java.util.Scanner;

public class Q7_ReverseDigit {
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
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(" Reverse Digit Array is  : "+reverseOfDigit(a[i]));
		}
}
  public static int reverseOfDigit(int n) {
	  int reverseNo=0;
	  while (n>0) {
		int rem=n%10;
		reverseNo=reverseNo*10+rem;
		n=n/10;
	}
	return reverseNo;
  }
  
}
