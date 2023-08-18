package javaprogramming;

public class MaxAndminNumberinArray {
public static void main(String[] args) {
	
	int a[] = {50,40,30,20,10,60};
//	int max = a[0];     //max = 50
//	
//	for(int i=1; i<a.length; i++) 
//	{
//		if(a[i]>max)
//		{
//			max =a[i];
//		}
//	}
//	System.out.println("Maximum number is : "+max);
	
	int min = a[0];  
	
	for(int i=1; i<a.length; i++)
	{
		if(a[i]<min)
		{
			min =a[i];
		}
	}
	System.out.println("minimum number is :"+min);
	
}
}
