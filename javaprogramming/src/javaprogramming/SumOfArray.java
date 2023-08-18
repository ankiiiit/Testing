package javaprogramming;

public class SumOfArray {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,10};
	int sum =0;
//	for(int i=0; i<5; i++) {
//		sum = sum + a[i];       
//	}
//	System.out.println("Sum of Array element :"+sum);
//	
	for(int value:a) {
		sum=sum+value;
	}
	System.out.println("Sum of Array element :"+sum);
	;
}
}
