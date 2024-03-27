package Class;
import java.util.*;
public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		System.out.println(" Enter The Size The Array ");
		int n= sc.nextInt();
		int [] a=new int[n];
		
//		System.out.println(" Enter the "+n+"Element Of Array");
		// For Initialization Of Array
		for(int i=0;i<a.length;i++) {	
			System.out.println(" Enter the "+(i+1)+" Element Of Array");
			a[i]=sc.nextInt();	
		}
		
		// Print The Array
		System.out.println(" All The Element Of Array is : ==============");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
