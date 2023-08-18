package javaprogramming;
import java.util.Scanner;
public class largestf3number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter frist number");
	int a=sc.nextInt();
	
	System.out.println("Enter frist number");
	int b=sc.nextInt();
	
	System.out.println("Enter frist number");
	int c=sc.nextInt();
//	
//	if(a>b && a>c) {
//		System.out.println(a+"is largest number");
//	}
//	else if(b>a && b>c) {
//		System.out.println(b+"is largest number");
//	} 
//	else {
//		System.out.println(c+"is largest number");
//	}
	
	int largest=a>b?a:b;
	int largest1=c>largest?c:largest;
	System.out.println(largest1+"largest number ");
	
	
	
	
}
}
