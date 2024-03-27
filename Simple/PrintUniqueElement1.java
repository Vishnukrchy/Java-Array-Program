package Simple;
import java.util.*;
public class PrintUniqueElement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ENter the Element Number: "+(i+1));
			a[i]=sc.nextInt();
		}
		getUniqueElement(a);
	}
	public static void getUniqueElement(int[] a)
	{
		int n=a.length-1;
		for(int i=0;i<=n;i++){
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n];
					n--;	j--;
				}
			}
			if(count==1)
			System.out.print(a[i]+"  ");
		}
	}

}
