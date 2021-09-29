package LinkedList;

import java.util.Scanner;
import java.util.ArrayList;

public class arithMean {
	
	public static void main(String args[]){
		int sum = 0;
		int i = 0;
		int num = 0;
	
		ArrayList<Integer> value = new ArrayList<Integer>();
	
		System.out.println("Enter value: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
    
		while(num != 0) {
			value.add(new Integer(num));
			num = sc.nextInt();
		}
		sc.close();
    
		for(i = 0; i < value.size(); i++) {
			sum += value.get(i);
		}
		int average = sum / value.size();
    
		System.out.println(value.size());
		System.out.println("Sum of values "+ sum + "  average " + average);
		return average;

	}
	
	public static double harmMean(ArrayList<E> nums) {
		double sum = 0.0;
		for(int i=0; i<value.size(); i++) {
			sum += (float)1/value.get(i);			
		}
		double harmonic = value.size / sum;
	}
	
	
	
}
