package abc;

public class method {

	public static int add(int x, int y) {

		int z = x + y;
		System.out.println(z);
		return z;

	}

	public static void multiply(int s, int d) {

		int a = s * d;
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 30;
		int b = 4;

		add(a, b);
		multiply(a, b);

	}
}
