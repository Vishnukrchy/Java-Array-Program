package Class;



import java.util.Scanner;

public class ArrayArmStrongNo {
	public static void main(String[] args) {
		System.out.println("Enter the Size Of Array");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter the "+(i+1)+" Elemnts Of Array ");
			a[i]=scanner.nextInt();
		}
		
		for (int i : a) {
			System.out.println(i==gePowertSum(i)?i+" Is ArmStrong No " : i+" Is Not  ArmStrong No " );
		}
		
		System.out.println();
	}

	public static int getCount(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static int gePowertSum( int n) {
		int sum=0,count=getCount(n);
		while (n>0) {
			sum=sum+getPower(n%10,count);
			n=n/10;
		}
		return sum;
	}

	public static int getPower(int a, int b) {
		int power = 1;
		for (int i = 1; i <= b; i++) {
			power = power * a;
		}
		return power;
	}

}
