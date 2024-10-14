package Array;

public class Shift012 {
	public static void main(String[] args) {
		int[] a = { 2, 0, 0, 0, 2, 1, 1, 0, 2, 1 };
		a=getshift012(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	public static int[] shift012(int [] a) {
		int count0=0;
		int count1=0;
		int b[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==0) {
				count0++;
			}else if (a[i]==1) {
				count1++;
			}
		}
		for (int i = 0; i < count0; i++) {
			b[i]=0;
		}
		for (int i = count0; i < count0+count1; i++) {
			b[i]=1;
		}
		for (int i = count0+count1; i < b.length; i++) {
			b[i]=2;
		}
		return b;
		
	}
	public static int[] getshift012(int [] a) {
		int count0=0;
		int count1=0;
		int b[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==0) {
				count0++;
			}else if (a[i]==1) {
				count1++;
			}
		}
		for (int i = count0; i < b.length; i++) {
			if (i<count0+count0) {
				b[i]=1;
			}else  {
				b[i]=2;
			}
		}
		return b;
		
	}
}
