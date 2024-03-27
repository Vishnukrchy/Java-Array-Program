package Class;
import java.util.*;
public class Q10_ChekOddEven {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   System.out.println(" Enter The No ");
	   int n= sc.nextInt();
	   
	   String [] s = {"Even","Odd"};
	   System.out.println(n+" is "+s[n/2]);
	   
}
}
