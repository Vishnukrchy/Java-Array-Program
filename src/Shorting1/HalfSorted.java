package Shorting1;
//WAJP TO PRINT THR FIRDT  HALF OF ARRAY IN ACESSINDING
//AND SECOND HALF IN DECESSNDING ORDER
public class HalfSorted {
public static void main(String[] args) {
	int [] a= {2,3,1,3,1,4,5,36,7,423,6,342,42,53,};
	System.out.println("========== OriginalArray is================== ");
	for (int i : a) {
		System.out.print(i+" ");
	}
	int [] b=getShortAse(a);
//	int l=b.length/2;
//	int p=0;

//	System.out.println(" +=====Half Asce ANd Desc Array is ==========");
//	for (int i = 0; i < b.length-1; i++) {
//		if (i>l) {
//			System.out.print(b[i]+" ");
//		}else {
//			System.out.print(a[a.length-1-p]+" ");
//			p++;
//			
//		}
//	}
	System.out.println();
	System.out.println("=====Half Asce ANd Desc Array is ==========");
	for (int i = 0; i < b.length/2; i++) {
		System.out.print(b[i]+" ");
	}
	for (int i = b.length-1; i >=b.length/2; i--) {
		System.out.print(b[i]+" ");
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
