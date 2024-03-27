package Class;

import java.util.Scanner;

public class Q5_PrintEvenCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner  sc=new Scanner(System.in);
			System.out.println(" Enter The Size The String Array ");
		    int n =sc.nextInt();
		    
			String [] s=new String[n];
			sc.nextLine();
			for(int i=0;i<s.length;i++) {	
				System.out.println(" Enter the "+(i+1)+" Element Of Array");
				s[i]=sc.nextLine();	
			
			}
			
			System.out.println(" All The Element Of Array is : ==============");
			for(int i=0;i<s.length;i++) {
				System.out.print(s[i]+" ");
			}
			System.out.println();
			getEvenCharacterString(s);
		
	}
	public static int getEvenCharacterString(String [] s) {
		int count =0;
		for( int i=0;i<s.length;i++) {
			String s1=s[i];
			if (s[i].length()%2==0) {
				count++;
				System.out.println(" Even Character String is : " +s[i]);
			}
			
		}
		System.out.println(" Total even character String is : "+count);
		return count;
	}

}
