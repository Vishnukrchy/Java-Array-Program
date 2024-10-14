package Shorting1;

public class BubbleSort1 {
public static void main(String[] args) {
	int [] a= {2,3,1,3,1,4,5,36,7,423,6,342,42,53,};
	System.out.println("========== OriginalArray is================== ");
	for (int i : a) {
		System.out.print(i+" ");
	}
	System.out.println();
	a=getShortAse(a);
	System.out.println("============= Sorted Array is================== ");
	for (int i : a) {
		System.out.print(i+" ");
	}
	
}
public static int[] getShortAse(int [] a) {
	int n=a.length;
	for (int i = 0; i < n-1-i; i++) {
		int con=0;//x=0
		for (int j = 0; j <n-1 ; j++) {
			if (a[j]>a[j+1]) {
				a[j]=a[j]+a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
				con=1;
			}
			
			
		}
		if (con==0) {
			break;
		}
		
	}
	return a;

}
}

