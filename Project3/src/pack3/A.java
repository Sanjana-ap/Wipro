package pack3;
	import java.util.*;
	public class A{

		public static void main(String[] args) {
			int a[]= {4,5,6,7,8};
			int b[]= {1,2,3,4,5};
			int c[]=new int[5];
			int d[]=new int[5];
			int i=0;
			while(i<a.length) {
				c[i]=a[i]+b[i];
				i++;
			}
			Arrays.sort(c);

			int ct=0;
			for(int j=c.length-1;j>=0;j--) {
				d[ct]=c[j];
				ct++;
			}
			System.out.println("Ascending "+Arrays.toString(c));
			System.out.println("Descending "+Arrays.toString(d));
			
			int n=a.length;
			int m=b.length;
			int merge[]=new int [m+n];
			for(int k=0;k<m;k++ )
				merge[k]=a[k];
			for(int k=0;k<m;k++ )
				merge[k+m]=b[k];
			System.out.println("Merged array "+ Arrays.toString(merge));
		}

	}

