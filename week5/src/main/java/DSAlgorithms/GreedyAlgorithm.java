package DSAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GreedyAlgorithm {
	public static void main(String args[] ) throws IOException{
		File fileRead = new File("D:\\Eclipse\\week5\\src\\main\\resources\\greedy.txt");
		Scanner sc = new Scanner(fileRead);
		//String line = sc.nextLine();
		String s[] = null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		int arr1[][];
		int arr2[];
		int row =2;
		while(sc.hasNext()) {
			String input = sc.next();
			System.out.println(input + "-" + input.length());
			s = input.split(",");
			System.out.println(s.length);
			
			//arr2 = new int[s.length];			
		}
		for(int i=0; i<s.length; i++ ) {
			arr1[i] = Integer.parseInt(s[i]);
			//System.out.println("Array1: "+ arr1[i]);
		}
		for(String text:s) {
	         al.add(text);
	    }
//		for(int i=0; i< s.length; i++) {
//			al.add(s[i]);
//		}
		/*
		for(int i=0; i<s.length; i++ ) {
			arr1[i] = Integer.parseInt(s[i]);
			System.out.println("Array2: "+ arr1[i]);
		}
		//sc.close();
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		long result = 0;
		int n = arr1.length;
        for (int i = 0; i < n ; i++)
            result += (arr1[0][i] * arr1[1][n - i - 1]);
        System.out.println(result);
 */
	}

}
