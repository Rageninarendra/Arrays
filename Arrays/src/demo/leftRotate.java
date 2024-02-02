package demo;
import java.util.Scanner;
public class leftRotate {
public static void main(String[] args) {
	System.out.println("Enter no of Rotations");
	int [] a = {1,2,3,4,5};
	int [] b =new int[a.length];
	Scanner scn= new Scanner(System.in);
	int noRotate=scn.nextInt();
	int rotatePoint=noRotate;
	 int i=0;
	 while(rotatePoint<a.length) {
		 b[i]=a[rotatePoint];
		 i++;
		 rotatePoint++;
	 }
	 rotatePoint=0;
	 while(rotatePoint<noRotate) {
		 b[i]=a[rotatePoint];
		 i++;
		 rotatePoint++;
	 }
	 System.out.println("original array");
	   for(int d:a) {
		   System.out.print(d+" ");
	   }
		System.out.println("\nOut put Array is");
		for(int c:b) {
			System.out.print(c+" ");
		}

	}

}
