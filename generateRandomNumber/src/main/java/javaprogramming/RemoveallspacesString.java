package javaprogramming;

public class RemoveallspacesString {
public static void main(String[] args) {
	
	String str = "java    automation   selenium   node ";
	
	str = str.replaceAll("\\s","         ");
	System.out.println(str);
}
}
