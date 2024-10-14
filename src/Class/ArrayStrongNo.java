package Class;

import java.util.Scanner;

public class ArrayStrongNo {
public static void main(String[] args) {
	System.out.println("Enter the Size Of Array");
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int a[] =new int[n];
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter The "+(i+1)+" Elements Of Array");
		a[i]=scanner.nextInt();
		
	}
	for (int i : a) {
		System.out.println(i==getFactSum(i)?i+" Is Strong No":i+" Is Not  Strong No");
	}
	
	
}
public static int getFactSum(int n) {
	int sum=0;
	while(n>0) {
		int rem =n%10;
		sum=sum+getFactorial(rem);
		n=n/10;
	}
	
	return sum;
}
public static int getFactorial(int n) {
	int fact=1;
	for (int i = 1; i <=n; i++) {
		fact=fact*i;
	}
	return fact;
}
}
