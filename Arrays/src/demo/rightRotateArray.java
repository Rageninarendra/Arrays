package demo;

public class rightRotateArray {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	//int []b=new int[a.length];
	int n=2;
	System.out.println("original array");
	for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	for(int i=0;i<n;i++) {
		int  b1,last;
		last= a[a.length-1];
		for( b1=a.length-1;b1>0;b1--) {
			a[b1]=a[b1-1];
		}
		a[0]=last;
	}
		System.out.println("after rotation");
		 for  (int i=0;i<a.length;i++) {
			 System.out.println(a[i]+" ");
		 }

	}

}
