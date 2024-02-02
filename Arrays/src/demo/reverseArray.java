package demo;

public class reverseArray {
public static void main(String[] args) {
	int []a = {1,2,3,4,5};
	System.out.println("Original array");
	 for(int i=0;i<a.length;i++) {
		 System.out.println(a[i]+" ");
	 }
	   System.out.println("reverse array");
	    for (int j=a.length-1;j>=0;j--) {
	    	System.out.println(a[j]+" ");
	    }
		

	}

}
