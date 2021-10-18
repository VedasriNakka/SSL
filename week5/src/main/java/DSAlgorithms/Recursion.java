package DSAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Recursion {
	
	static int recursion(int n1, int n2) {
		if(n1 > n2)
			return 0;
		else {
			System.out.println(n1);
			return recursion(n1+2, n2);
		}
		
	}

	public static void main(String[] args) throws IOException {
		File readfile = new File("D:\\Eclipse\\week5\\src\\main\\resources\\RecursionInt.txt");	//loading file
		Scanner sc = new Scanner(readfile);
		int number = sc.nextInt();
		System.out.println(number);
		
		recursion(0 ,number);
		sc.close();
		
	}

}
