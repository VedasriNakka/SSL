package LinkedList;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Mean {
	
	public static double harmMean(ArrayList<Integer> value1) {
		double sum = 0.0;
		
		//System.out.println("0 sum = " + sum);
		for(int i=0; i<value1.size(); i++) {
			sum += 1.0 / ((double) value1.get(i));
			//System.out.println(i+ " | " + sum);
		}
		//System.out.println("1 sum = " + sum);
		double harmonic = value1.size() / sum;
		//System.out.println("2 harm = " + harmonic);
		return Math.floor(harmonic*100)/100;
	}
	
	public static double arithMean(ArrayList<Integer> value) {
		double sum = 0.0;
		Iterator<Integer> it = value.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			sum += it.next();
		}
		double average = sum / value.size();
		return average;
	}
	
	public static double geomMean(ArrayList<Integer> value) {
		double product = 1.0;
		
		Iterator<Integer> pm = value.iterator();
		while(pm.hasNext()) {
			product *= pm.next();
		}
		
		double gm = (float)Math.pow(product, (float)1 / value.size());
		return Math.floor(gm*100)/100;
	}
	
	public static void main(String args[]){
		int num = 0;
	
		ArrayList<Integer> value = new ArrayList<Integer>();
	
		System.out.println("Enter length of number list to check: ");
		Scanner sc = new Scanner(System.in);		
		num = sc.nextInt();
		
		System.out.println(num);
		
			
		for(int i =0; i<num; i++) {
			System.out.println("Enter the number: ");
			int num1 = sc.nextInt();
			System.out.println("Your entered number is: "+ num1);
			value.add(new Integer(num1));
		}
		sc.close();
		
		System.out.println("harmonic Mean: "+ harmMean(value));
		System.out.println("Arith Mean: " + arithMean(value));
		System.out.println("geometric Mean: "+ geomMean(value));
	}

}

