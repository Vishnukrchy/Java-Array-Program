package Array;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int s[]= {2,2, 3  , 9 , 3 , 7 , 9 ,4,4,2};
		int [] a=reemoveDuplicates(s);
		for (int i : a) {
			System.out.print(i+" ");
		}
		
	}
	static int count=1;
	public static int[] reemoveDuplicates(int [] s) {
		int n=s.length-1;
		
		for (int i = 0; i <=n; i++) {
			
			for (int j = i+1; j <n; j++) {
				if (s[i]==s[j]) {
					s[j]=s[n];
					count++;
					j--;
					n--;
				}
				
			}
			System.out.println(s[i]+" Is "+count+" Times ");
			
		}
		int b[] =new int[n];
		for (int i = 0; i < b.length; i++) {
			b[i]=s[i];
		}
		return b;
		
	}
}
