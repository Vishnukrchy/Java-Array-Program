package Class;

import java.util.Scanner;

public class Q13_Print_Duplicate_Values {

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
	          chekDupicateFrequencyElement(a);
}
public static void chekDupicateFrequencyElement(int [] a) {

	int n=a.length-1;
	for(int i=0;i<=n;i++){
		int count=1;
		for(int j=i+1;j<=n;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=a[n];
				
				n--;
				j--;
			}
		}
		
		if (count>1) {
			System.out.println(a[i]+" is " +count+" times");
			
		}
		
	}
}


}
