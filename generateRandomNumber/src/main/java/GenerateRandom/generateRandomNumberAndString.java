package GenerateRandom;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class generateRandomNumberAndString {
public static void main(String[] args) {
	Random rand =new Random();
	
//	int rand_int=rand.nextInt(500);
//	System.out.println(rand_int);
	

    //double rand_dbl = rand.nextDouble(10);     //rang 0.0 and less then 1.0
    //System.out.println(rand_dbl);
 
	  //Approach02 -Math
	//System.out.println(Math.random());

      //Approach03 -Apache common - lang API
	
	//String rand_num=RandomStringUtils.randomNumeric(5);
	 //System.out.println(rand_num);
	
	String randstr=RandomStringUtils.randomAlphabetic(4);
	System.out.println(randstr);
}
}
