package abc;

public class Methodoveloading {

	static void foo() {
		System.out.println("Hello");
	}

	static void foo(int a) {
		System.out.println("Bye");
	}

	static void foo(int a,int b) {
		System.out.println("Byeeeeeeeeeeeeeeeeeeeee");}

	static void foo(String x) {
		System.out.println("Betetgdgve");}

	static void foo(Boolean x) {
		System.out.println("India");}
	static void foo(Boolean x,Boolean y) {
		System.out.println("India is my country");}
	
	
	static void add(int x, int y) {
		System.out.println(x+y);
	}
	
	static void add(int x, int y,int z) {
		System.out.println(x+y+z);
	}
	

	static void add(String s) {
		System.out.println(s);
	}
	
	static void add() {
		System.out.println("Runnnn");
	}
	
	

	public static void main(String[] args) {
	add(6,5);

	}
}
