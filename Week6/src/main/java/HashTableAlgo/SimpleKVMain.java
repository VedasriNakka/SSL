package HashTableAlgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;

public class SimpleKVMain {

	public static void main(String[] args) {
		
		int maxlength = 0;
		// Taking input from
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number to generate random key value pairs: ");
		maxlength = sc.nextInt();
		System.out.println("Your entered number is: "+ maxlength);
		
		SimpleKVImple sv = new SimpleKVImple(maxlength);
			
	    
	    long startTime = System.nanoTime();
	    for(int i = 0; i < maxlength; i++){

	  	    String randomString = RandomStringUtils.randomAlphabetic(8);
	  	    int randomNum = sv.random.nextInt(10) + 1;
	  	    sv.put(randomString, randomNum);	  	    
	    }   
	    
	    long entTime = System.nanoTime();
		long totalTime = (entTime - startTime) / 1000000L;
		System.out.println("Executed in " + totalTime + " ms");
	    
		sv.print();
		
		String randomString = sv.get_randomkey();
		System.out.println("Random Key: "+ randomString + ",  Value: " +sv.lhm.get(randomString));
		
		sv.remove_key(randomString);
		
		
		sv.print();
		
		for(int i = 0; i < 5; i++){

	  	    String randomString2 = RandomStringUtils.randomAlphabetic(8);
	  	    int randomNum = sv.random.nextInt(10) + 1;
	  	    sv.put(randomString2, randomNum);	
			System.out.println("newly added keys: ");
			sv.print();

	    }   
		
		System.out.println("New Key Value pairs: ");
		sv.print();	

	}

}
