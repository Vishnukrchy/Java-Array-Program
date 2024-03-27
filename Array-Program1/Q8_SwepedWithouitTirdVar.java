package Class;

public class Q8_SwepedWithouitTirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] a= {2,4,3,24,43,23,56,4,2,1,4,};
        
       System.out.println(" Original Array is : " );
       for (int x : a) {
		System.out.print(x+" ");
	}
       System.out.println();
       getSwapedIndexValues(a);
       
	}
	public static void getSwapedIndexValues(int []a) {
		a[3]=a[3]+a[7];
		a[7]=a[3]-a[7];
		a[3]=a[3]-a[7];
		System.out.println(" Swaped Array is ================ ");
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
