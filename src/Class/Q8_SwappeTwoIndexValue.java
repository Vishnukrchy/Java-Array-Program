package Class;

public class Q8_SwappeTwoIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] a= {1,4,56,6,3,4,3,5};
      System.out.println(" Original Array is : ");
      for(int i=0;i<a.length;i++) {
    	  System.out.print(a[i]+" ");
      }
    swapedIndexValueOfArray(a);
    
      
	}
	
	public static void swapedIndexValueOfArray(int [] a) {
		System.out.println("=================");
		int temp=a[0];// first index
		
		a[0]=a[a.length-1];//second index
		a[a.length-1]=temp;
		System.out.println(" Swaped Array is ============== ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
