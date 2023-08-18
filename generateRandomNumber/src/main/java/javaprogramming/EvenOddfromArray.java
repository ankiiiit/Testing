package javaprogramming;

public class EvenOddfromArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	 
		/*	System.out.println("Even number in Array:");
			for(int i=0; i<a.length; i++) {
				if(a[i]%2==0) {
					System.out.println(a[i]);
				}}
					
			System.out.println("Odd number in Array:");
			for(int i=0; i<a.length; i++) {
				if(a[i]%2!=0) {
					System.out.println(a[i]);
				}}			*/
	
	// Enhanced loop
	
	    System.out.println("Even number in Array:");
	    for(int value:a) {
	    	if(value%2==0) {
	    		System.out.println(value);
	    	}}
	    
	    System.out.println("Odd number in Array:");
	    for(int value:a) {
	    	if(value%2!=0) {
	    		System.out.println(value);
	    	}}
	
}
}
