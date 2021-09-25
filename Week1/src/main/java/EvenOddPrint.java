
import java.util.Scanner;

public class EvenOddPrint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	// taking input from command line
		System.out.println("Enter num:");
		int number = sc.nextInt();				// converting string to int
		
		if(number%2 == 0) {
			for(int i =0;i<number; i++) {		// printing even number of "-"
				System.out.println("-");
			}
		}
		else {
			for(int i =0;i<number; i++) {		//printing odd number of "="
				System.out.println("=");
			}
		}
		sc.close();
	}
}
