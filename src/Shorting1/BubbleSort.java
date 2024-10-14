package Shorting1;

public class BubbleSort {
public static void main(String[] args) {
	int [] a= {2,3,1,3,1,4,5,36,7,423,6,342,42,53,};
	System.out.println("========== OriginalArray is================== ");
	for (int i : a) {
		System.out.print(i+" ");
	}
	System.out.println();
	int b[]=getShort(a);
	System.out.println("============= Sorted Array is================== ");
	for (int j : b) {
		System.out.print(j+" ");
	}
	
}
public static int[] getShort(int [] a) {
	int n=a.length;
	for (int i = 0; i < n - 1; i++) {
	    int x = 0; // x=0
	    for (int j = 0; j < n - 1 - i; j++) {
	        if (a[j] > a[j + 1]) {
	            a[j] = a[j] + a[j + 1];
	            a[j + 1] = a[j] - a[j + 1];
	            a[j] = a[j] - a[j + 1];
	            x = 1;
	        }
	       
	    }
	    if (x == 0) {
            break;
        }
	}

	return a;

}
}
