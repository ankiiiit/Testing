package javaprogramming;

public class countnumberevenodd {
	public static void main(String[] args) {
		int num = 1234;

		String num_strng = Integer.toString(num); // convert int to string
		String[] numarray = num_strng.split("");

		int evencount = 0;

		for (int i = num_strng.length()  - 1; i > 0; i--) {
			int s = Integer.parseInt(numarray[i]);
			if (s % 2 == 0) {
				evencount++;
			}
		}
		int oddcount = numarray.length - evencount;
		System.out.println("eventcount = " + evencount);
		System.out.println("odd count = " + oddcount);

	
	}
}
