package javaprogramming;

public class PrimeNumber {
	public static void main(String[] args) {

//		int num = 5;
//
//		int prime = 1;
//
//		if (num == 1 || num==0) {
//			System.out.println(num + " is not prime");
//		} else {
//			for (int i = 2; i < num; i++) {
//
//				if ((num % i == 0)) {
//
//					prime = 0;
//					// not prime    
//
//				}
//			}
//
//			if (prime == 1) {
//				System.out.println(num + " is prime");
//			} else { 
//				System.out.println(num + " is not prime");
//			} 
//		}

		int num = 22;
		int prime = 1;
		
		if(num==1 || num==0) {
			System.out.println(num+" is not prime ");
		}
		else {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					prime=0;
				}
			}
			if(prime==1) {
				System.out.println(num+" is prime number");
			}
			else {
				System.out.println(num+" is not prime number");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
