package Shorting;
import java.util.*;
public class Q21_Sort_aArrray_Dec {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println(" Enter The Size Of Array is ");
	int n=sc.nextInt();
	int [] a =new int[n];
	for(int i=0;i<a.length;i++) {
		System.out.println(" Enter the "+i+1+" Element of array");
		a[i]=sc.nextInt();
	}
	System.out.println(" Original Array is ");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	int b[]=sortArrayDec(a);
	System.out.println(" New Sorted Array is ");
	for (int x : b) {
		System.out.print(x+" ");
	}
	System.out.println();
	
}
 public static int [] sortArrayDec(int [] a) {
	int n=a.length-1;
	for(int i=0;i<n;i++) {
		int x=0;//x/count=0
		for(int j=0;j<n-i;j++) {
			if (a[j]<a[j+1]) {
				a[j]=a[j]+a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
				x++;
			}
		}
		if (x==0) {
			break;
		}
		
	}
	return a;
	
}
}
