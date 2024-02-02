package demo;

public class duplicateArray {
public static void main(String[] args) {
	int [] a= {1,1,1,2,2,3,3,5,5,4};
	System.out.println("Duplicate ArrayS ");
	for(int i=1;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) 
				System.out.println(a[j]);
			}
		}
	}
		
	}


