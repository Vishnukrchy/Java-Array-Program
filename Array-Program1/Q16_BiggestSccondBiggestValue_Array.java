package Class;

import java.util.Scanner;

public class Q16_BiggestSccondBiggestValue_Array {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);		
  		System.out.println( " Enter The Size Of Array Is : ");
  		int n =sc.nextInt();
  		int [] a= new int[n];
  		
  		for(int i=0;i<a.length;i++) {
  			System.out.println(" Enter The Array "+(i+1)+" Element ");
  			a[i]=sc.nextInt();
  		}
  	 System.out.println(" All Array Element Is : ");
  	 for(int i=0;i<a.length;i++) {
  		 System.out.print(a[i]+" ");
  	 }
  	 System.out.println();
  	 checkBiggestSccondBiggest(a);
  
	}
      public static void checkBiggestSccondBiggest(int []a) {
		int biggest=a[0];
		int seccondBiggest=a[0];
		
		for(int i=0;i<a.length;i++) {
			if (a[i]>biggest && a[i]!=seccondBiggest) {
				seccondBiggest=biggest;
				biggest=a[i];
				
			} else if(a[i]>seccondBiggest&&a[i]!=biggest) {
                    seccondBiggest=a[i];
			}
			
		}
		System.out.println(" Biggest Element Of Array is : "+biggest);
		System.out.println("Second Biggest Element Of Array is : "+seccondBiggest);
	}
}
