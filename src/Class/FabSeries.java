package Class;

import java.util.Scanner;

public class FabSeries {
public static void main(String[] args) {
	System.out.println("Enter The nTh Position Of series ");
	int a=0,b=1,c=0;
	
	for (int i = 0; i <12; i++) {
		System.out.print(a+" ");
		c=a+b;
		
		b=a;
		a=c;
		
	}
}
}
