package abc;

public class Vedio32_Methods_overloading {
//	static void change(int a) {
//		a=12;
//	}
//	
//	static void change2(int []arry) {
//		arry [0]=98;
//	}
	
	
//static void telljoke() {
//	System.out.println("I invented a new word!\n"+"plagiarism!");
//}

//	telljoke();
	
	
	//case1:changing the integer
//	int  mrks[]= {11,22,33,44,55,66};
//	int  x=100;
//	change(x);
//	
//	System.out.println("The value of x after changing is -"+x);
	
	//case2:changing the array
//	int  mrks[]= {11,22,33,44,55,66};
//	change2(mrks);
//	
//	System.out.println("The value of arry after changing is -"+mrks[0]);
//	
	   //case3:metho overloading
	
	static void foo() {
		System.out.println("good morning bro!");
	}
	
	static void foo(int a,int b) {
	    	System.out.println("hello "+a+" bro!");
	    	System.out.println("hello "+b+" bro!");
	    }
	public static void main(String[] args) {
	 foo();
	 foo(5,6);
	}
}

