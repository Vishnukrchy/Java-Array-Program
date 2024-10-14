package Class;

import java.util.Scanner;

public class MssingNo {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=scanner.nextInt();
    int a[] = new int[size];
    for (int i = 0; i < a.length; i++) {
		System.out.println(" enter the "+(i+1)+" elements");
	}
}

}
