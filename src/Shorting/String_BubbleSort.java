package Shorting;

import java.util.Iterator;
import java.util.Scanner;

public class String_BubbleSort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the Size Of String array: ");
	int n = sc.nextInt();
	String[] s = new String[n];
	for (int i = 0; i < s.length; i++) {
		System.out.println("ENter the Element Number: " + (i + 1));
		s[i] = sc.next();
	}
	System.out.println(" Original String is");
	for (String string : s) {
		System.out.print(string+" ");
	}
	getStringArraySort(s);

}
public static void getStringArraySort(String [] s) {
	int n=s.length;
	for (int i = 0; i <n-1; i++) {
		int x=0;
		for (int j = 0; j <n-1-i; j++) {
			if (s[j].compareToIgnoreCase(s[j+1])>0) {
				String tempString= s[j];
				s[j]=s[j+1];
				s[j+1]=tempString;
				x=1;
			}
		}
		if (x==0) {
			break;
		}
	}
	System.out.println(" Sorted String Array is");
	for (String string : s) {
		System.out.print(string+" ");
	}
}
}
