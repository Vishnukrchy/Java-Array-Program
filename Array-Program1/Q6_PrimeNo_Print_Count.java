package Class;

import java.util.Scanner;

public class Q6_PrimeNo_Print_Count {
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
		int count=0;
		for(int i=0;i<a.length;i++) {
			if (checkPrimeNo(a[i])) {
				count++;
				System.out.println(" Prime No Arary Element is : "+a[i]);
			}
		}
		System.err.println(" Total Prime No Array Elent is : "+count);
}
    public static boolean checkPrimeNo(int n) {
	for(int i=2;i<=n/2;i++) {
		if (n%i==0) {
			return false;
		}
	}
	return true;
  }


}
