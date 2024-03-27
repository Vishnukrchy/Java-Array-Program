package Simple;

public class EvenIndex {
public static void main(String[] args) {
	int [] a= {4,5,4,3,5,6,43,6,43,0};
	for(int i=0;i<a.length;i++) {
		if (i%2==0) {
			System.out.println("Even Index Array is : "+a[i]);
		}
	}
}
}
                                                                                        