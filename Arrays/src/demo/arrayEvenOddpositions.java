package demo;

public class arrayEvenOddpositions {
public static void main(String[] args) {
	int []a = {1,2,3,3,4,5,6,7,8};
	//even
	System.out.println("Even positions");
	for(int i=2; i<a.length;i=i+2) {
	System.out.println("index "+ i+" " +a[i]+" ");
	}
	//odd
	System.out.println("Odd positions");
	for(int j=1; j<a.length;j=j+2) {
		System.out.println("index "+ j+" " + a[j]+" ");
	}
	}
}

