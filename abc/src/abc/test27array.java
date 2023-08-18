package abc;

public class test27array {
public static void main(String[]args) {
	//int[] marks = {11,22,33,44,55};
	//float[] marks = {11.5f,22.5f,33.5f,44.5f,55.5f};
	//System.out.println(marks.length);
	//System.out.println(marks[2]);
	
	//String[] student = {"deepak","goutam","rahul","yadav"};
	//System.out.println(student.length);
	//System.out.println(student[2]);
	
	
	//1. for loop;
	int[] marks = {11,22,33,44,55};
	int i=0;
	System.out.println("printing using for loop");
	for (i=0;i<marks.length;i++) {
	
		System.out.println(marks[i]);         // array traversal 
	}
	
	// 2. for loop reverse;
	
	System.out.println("printing using for loop reverse");
	for (i=marks.length-1; i>=0; i--) {
	
		System.out.println(marks[i]);
	}
	
	// 3. for each loop ;
	
	System.out.println("printing using for each loop");
	for(int element:marks) {
		System.out.println(element);
	}
	
	
}
}
