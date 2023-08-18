package javaprogramming;

import java.util.Arrays;
import java.util.Collections;
public class Sortingbuildmethod {
public static void main(String[] args) {
	
	   //Approach01
	
//	int a[]= {3,4,2,5,1};
//	
//	System.out.println("Before sorting: "+Arrays.toString(a));
//	Arrays.parallelSort(a);
//	System.out.println("After sorting: "+Arrays.toString(a));
	
	
        //Approach02
	
//    int a[]= {3,4,2,5,1};
//	
//	System.out.println("Before sorting: "+Arrays.toString(a));
//	Arrays.sort(a);
//	System.out.println("After sorting: "+Arrays.toString(a));
	
	    //Approach03
	
   Integer a[]= {3,4,2,5,1};
	
	System.out.println("Before sorting: "+Arrays.toString(a));
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println("After sorting: "+Arrays.toString(a));
}
}
