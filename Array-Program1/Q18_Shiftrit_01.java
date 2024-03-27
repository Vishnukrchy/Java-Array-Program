package Class;

import java.util.Scanner;

public class Q18_Shiftrit_01 {
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
	 	  checkSmallestSecondSmallest(a);
} 
}
