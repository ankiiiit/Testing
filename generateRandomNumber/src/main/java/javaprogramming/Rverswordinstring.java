package javaprogramming;

public class Rverswordinstring {
public static void main(String[] args) {
	
/*	String str="welcome to java ";  //original string 
	String [] words=str.split(" ");  //splitting string 
	
	String reverseString = " ";
	
	for(String w:words)
	{
		String reverseword="";
		for(int i=w.length()-1; i>=0;i--)
		{
			reverseword=reverseword+w.charAt(i);
		}
		reverseString=reverseString+reverseword+" ";
	}
	System.out.println(reverseString);
*/
	
	String str="welcome to java ";  //original string 
	String [] word=str.split(" ");  //splitting string 
	
	String reverseword = " ";
	
	for(String w:word)
	{
		 StringBuilder sb=new StringBuilder(w);
		 sb.reverse();
		 reverseword=reverseword+sb.toString()+" ";
		 }
	System.out.println(reverseword);
	
	
	
}
}
