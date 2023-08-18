package javaprogramming;

public class MissingArrayNumber {
public static void main(String[] args) {
	 
	int a1[]= {1,2,4,5};

	int sum1=0;
	for(int i=0; i<a1.length; i++)
	{
		sum1=sum1+a1[i];
	}
	System.out.println("sum of array "+sum1);
	
	int sum2=0;
	for(int i=0; i<=5; i++)
	{
		sum2=sum2+i;
	}
	System.out.println("sum of array "+sum2);
	System.out.println("missing number of array "+(sum2-sum1));
	
}
}
