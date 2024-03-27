package Class;
import java.util.Scanner;
public class Q2_BiggestSmmalestElement_Difference {
 public static void main(String[] args) {
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
		
		getFindBigestSmallest(a);
 }
		public static void getFindBigestSmallest(int [] a) {
			if (a.length==1) {
				System.out.println(" Biggest and Smallest Digit are dosnt Exist in This Array ");
			}
			else {
				int big=0;
				int small=9;
				for(int i=0;i<a.length;i++) {
					if(a[i]>big) {
						big=a[i];
					}
					else if (small>a[i]) {
						small=a[i];
					}
				}
				if (big==small) {
					System.out.println(" Bigest And Smallest Elemet are Same in this Array that is "+big+ " And diffrence is "+(big-small));
				}else  {
					System.out.println(" Bigest  Elemet of this Array  is  "+big);
					
					System.out.println(" Smallest  Elemet of this Array  is  "+small);
					System.out.println(" Diference b/w Bigest And Smallest  Elemet of this Array  is  "+(big-small));
					
				}
			}
		}

 }

