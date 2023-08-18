package javaprogramming;

public class Removejunkorspecialchar {
public static void main(String[] args) {
	
	String s="$%^&* latin  %$^#%^@%$$(&* 01234567890";
	
	s = s.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(s);
}}

