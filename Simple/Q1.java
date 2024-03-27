package Simple;

public class Q1 {
public static void main(String[] args) {
	 // Decalaration Of array 
	int [] a= {4,5,4,3,5,6,43,6,43,0};
	int [] b = new int[10];
	
	double [] d ;
	d=new double [9];
	d[0]=4;
	d[2]=5;
	d[4]=44;
	d[5]=56;


	
	
	System.out.println( " Array of a is "+a[0]);
	System.out.println( " Array of a is "+a[1]);
	System.out.println( " Array of a is "+a[2]);
	System.out.println( " Array of a is "+a[3]);
	System.out.println( " Array of a is "+a[4]);
	System.out.println( " Array of a is "+a[5]);
	System.out.println( " Array of a is "+a[6]);
	System.out.println( " Array of a is "+a[7]);
	
	System.out.println( " Array Address a "+a);
	System.out.println( " Array Address b "+b);

	System.out.println( " Array of d is "+d[0]);
	System.out.println( " Array of d is "+d[1]);
	System.out.println( " Array of d is "+d[2]);
	System.out.println( " Array of d is "+d[3]);
	System.out.println( " Array of d is "+d[4]);
	System.out.println( " Array of d is "+d[5]);
	System.out.println(" Print  By For Loop =======================");
  for(int i =0;i<a.length;i++) {
	  System.out.println( " array of a : "+a[i]);
  }
	System.out.println(" Iniatilize By For  Loop =======================");
	for(int i=0;i<b.length;i++) {
		b[i]=i;
		System.out.println(" Array of B is : "+b[i]);
	}
	
	
}

}
