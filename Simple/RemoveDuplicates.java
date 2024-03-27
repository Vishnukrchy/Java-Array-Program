package array_programming;

import java.util.Scanner;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("ENter the Element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] k=removeDuplicates(a);
		System.out.println("Unique Elements: ");
		for(int x:k)
			System.out.print(x+"  ");
	}
	public static int[] removeDuplicates(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					a[j]=a[n-1];
					j--;
					n--;
				}
			}
		}
		int[] b=new int[n];
		for(int i=0;i<n;i++)
			b[i]=a[i];
		return b;
	}
		

}

	
	
	
	
	
	
	
	
	
	
	
	