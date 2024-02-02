package demo;

public class copyArrayEle {
public static void main(String[] args) {
	int [] a = {1,2,3,4,5};
	int [] b = new int [a.length];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	System.out.println("original elements of array");
	   for(int i=0;i<a.length;i++) {
		   System.out.println(a[i]+" ");
	   }
	   System.out.println();
		 System.out.println("copied array");
		 for(int i=0;i<b.length;i++) {
			 System.out.println(b[i]+" ");
		 }

	}

}
