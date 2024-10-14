package YuTube;

import java.util.Scanner;

public class PairX_Sum {
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
		System.out.println(" pair Of Sum is "+pairOfxSum(a));
	} 
	 public static int pairOfxSum(int [] a) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println(" Enter The Value Of target X is ");
		 int target=sc.nextInt();
		 int count=0;
		 int n=a.length-1;
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<=n;j++) {
				 if (a[i]+a[j]==target) {
					count++;
					System.out.println( " Pair is "+a[i]+"+"+a[j]+" = "+target);
				}
			 }
		 }
		 return count;
	 }
}
