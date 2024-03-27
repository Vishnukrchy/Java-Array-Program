package Class;
import java.util.*;
public class Q15_PrintCount_MaxFrequency_Element {
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
		checkMaxFreqnElement(a);
	}
	public static void checkMaxFreqnElement( int [] a) {
		int maxCount=0;
		int targetValue =0;
		int n=a.length-1;
	
		for(int i=0;i<=n;i++){
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n];
					
					n--;
					j--;
				}
				
			}
			if (maxCount<count) {
				maxCount=count;
				targetValue=a[i];
			}
			
		}
		System.out.println(targetValue+" Is Apeared Most times in Array  "+maxCount+" times " );
	}
	
	
}
