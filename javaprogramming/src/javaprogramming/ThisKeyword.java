package javaprogramming;

import java.util.Scanner;

public class ThisKeyword {

	int price=50 ;
	
	public void ThisKeyword(int price) {
		this.price = price;
		System.out.println("Integer constructor" +price);
	}
	
	public ThisKeyword(String price) {
	//	this.price = price;
		System.out.println("String constructor" +price);
	}
	
	Scanner r = new Scanner("");
	
	
	
	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword("");
		

	}
	
}
