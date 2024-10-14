package YuTube;

import java.util.Scanner;

public class StrictlyGreaterThanX {

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
 		System.out.println();
 		System.out.println(" Strictly Greater The X  Element  is : "+strictlyGreaterThanOfX(a));
	}
	
	public static int  strictlyGreaterThanOfX(int [] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the element value");
		
		int x=sc.nextInt();
	     int greater =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>x) {
				greater=a[i];
		}
			
		}
		return greater;
	}
	}


