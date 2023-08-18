package javaprogramming;

import java.util.Arrays;

public class ArrayareEquals {
	public static void main(String[] args) {
		
		// approach01
		
	//	int a1[] = { 1, 2, 3, 4, 5 };
	//	int a2[] = { 1, 2, 3, 4, 5 };
		
// 	boolean status=Arrays.equals(a1,a2);
//	
//	if(status==true) 
//	{
//		System.out.println("Array are equals");
//	}
//	else 
//    {
//		System.out.println("Array are not equals");
//  }

		// approach02
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };
		boolean status = true;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;				
				}}}

		else {	status = false;	}
		if (status == true) {
			System.out.println("Array are Equals");
		} else {
			System.out.println("Array are not Equals");
		}

	}
}
