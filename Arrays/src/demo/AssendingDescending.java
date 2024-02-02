package demo;

public class AssendingDescending {
public static void main(String[] args) {
	int [] a= new int [] {4,5,2,6,1,9,7,5,};
	 System.out.println("original Array");
	  for (int i=0;i<a.length;i++) {
		  System.out.println(a[i]+" ");
	  }
	  int temp=0;
	  for (int i=0;i<a.length;i++) {
		  for(int j=i+1;j<a.length;j++) {
			  if(a[i]<a[j]) {  //decending only change > to <
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
			    }
	  }
	  System.out.println("Asscending order");
	  for(int i=0;i<a.length;i++) {
		  System.out.print(a[i]+" ");
	  }
		
	
}


}
