package javaprogramming;

public class fibonacciseries {
public static void main(String[] args) {
	int n1 = 0, n2=1, sum = 0;
	System.out.print(n1+" "+n2);
	for(int i=2; i<10; i++) {
		sum=n1+n2;   //1+1 
		System.out.print(" "+sum);  //2
		n1=n2;     //1
		n2=sum;   //2
	}
}
}
