package javaprogramming;
import java.util.Scanner;
public class Reversenumber {
public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int num = sc.nextInt();
	int num =1234;
	int rev =0;
	while(num!=0) {
		rev  = rev*10+num%10;   //1234 =4
		
		num = num/10;
		
		System.out.println("rev :"+rev+ " "+ " num :"+ num);
	}
	System.out.println("Revers number is :"+rev);
}
}
