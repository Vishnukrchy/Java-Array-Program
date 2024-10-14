package Simple;

public class OddIndex {
public static void main(String[] args) {
	int [] a= {4,5,4,3,5,6,43,6,43,0};
	for(int i=0;i<=a.length-1;i++) {
		if (i%2!=0) {
			System.out.println("Odd Index Array is : "+a[i]);
		}
	}
}
}
