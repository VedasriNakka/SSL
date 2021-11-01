package DSAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DotProduct {
	public static void main(String args[]) throws IOException {
		File fileRead1 = new File("D:\\Eclipse\\week5\\src\\main\\resources\\greedyArray1.txt");
		File fileRead2 = new File("D:\\Eclipse\\week5\\src\\main\\resources\\greedyArray2.txt");

		Scanner sc1 = new Scanner(fileRead1);
		Scanner sc2 = new Scanner(fileRead2);
		//String line = sc.nextLine();
		
		String line1 = sc1.nextLine();
		String s1[] = line1.split(",");
		int arr1[] = new int[s1.length];
		for(int i=0; i<s1.length; i++ ) {
			arr1[i] = Integer.parseInt(s1[i]);
			System.out.println("Array1: "+ arr1[i]);
		}
		
		String line2 = sc2.nextLine();
		String s2[] = line2.split(",");		
		int arr2[] = new int[s2.length];
		
		for(int i=0; i<s2.length; i++ ) {
			arr2[i] = Integer.parseInt(s2[i]);
			System.out.println("Array2: "+ arr2[i]);
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int result = 0;
		int n = arr1.length;
        for (int i = 0; i < n ; i++) 
        	result += (arr1[i] * arr2[n-i-1]);
            
        System.out.println(result);
	}

}
