package javaprogramming;

public class CountoccurancesinString {
public static void main(String[] args) {
	
	String s="java programming java oops";
	
	 int totalcount=s.length();
	int totalcount_afterremove=s.replace("j","").length(); 
	int count = totalcount -totalcount_afterremove;
	System.out.println(count);
}
}
