package DSAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DivConquer {
	
	public static void mergeSort(int arr[], int lower, int upper) {
		if(lower < upper) {
			int mid = (lower+upper)/2;		//sorting
			
			mergeSort(arr, lower, mid);
			mergeSort(arr, mid+1, upper);
			merge(arr, lower, mid, upper);
		}
	}

	public static void merge(int[] arr, int lower, int mid, int upper) {

		int leftSize = mid - lower+1;
		int rightSize = upper - mid;
		
		int leftArray[] = new int[leftSize];
		int rightArray[] = new int[rightSize];
		
		for(int i =0; i<leftSize; i++) {
			leftArray[i] = arr[lower+i];
		}
		for(int j =0; j<rightSize; j++) {
			rightArray[j] = arr[mid+1+j];
		}
		
		int i = 0, j = 0, k = lower;
		while(i < leftSize && j < rightSize) {
			if(leftArray[i] < rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
				k++;
			}
		}
		while(i < leftSize) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j < rightSize) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}	
	}
	
	static int binarySearch(int arr[], int low, int high, int item) {
		if(high >= low) {
			int mid = (low+high)/2;
			
			if(arr[mid] == item)
				return mid;
			if(arr[mid] > item)
				return binarySearch(arr, low, mid, item);
			return binarySearch(arr, mid+1, high, item);	
		
		}
		return -1;
	}
	
	public static void main(String args[]) throws IOException {
		File fileRead = new File("D:\\Eclipse\\week5\\src\\main\\resources\\mergeSort.txt");
		Scanner sc = new Scanner(fileRead);
		String line = sc.nextLine();
		String s[] = line.split(",");
		int num[] = new int[s.length];
		
		int high =num.length;
	
		for(int i=0; i<s.length; i++ ) {
			num[i] = Integer.parseInt(s[i]);
		}
		sc.close();
		mergeSort(num, 0, high-1);
		String n = Arrays.toString(num);
		
		System.out.println(n);
		
		int searchItem = binarySearch(num, 0, (num.length - 1), 3);
		
		if(searchItem == -1)
			System.out.println("Number not found ");
		System.out.println("Number found at index: " + searchItem);
	}

}
