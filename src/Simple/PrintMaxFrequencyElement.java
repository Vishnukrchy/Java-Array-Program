package Simple;
import java.util.Scanner;
public class PrintMaxFrequencyElement {
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
		getMaxFrequencyElement(a);
	}
	public static void getMaxFrequencyElement(int[] a)
	{
		int n=a.length-1; int max_count=0; int target=0;
		for(int i=0;i<=n;i++){
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n];
					n--;	j--;
				}
			}
			if(max_count<count) {
				target=a[i];	max_count=count;
			}
		}
		System.out.println(target+" has appeared "+max_count+" times");
	}


}
