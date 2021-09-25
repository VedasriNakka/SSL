
import java.util.Scanner;

public class EvenOddPrint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			for(int i =0;i<number; i++) {
				System.out.println("-");
			}
		}
		else {
			for(int i =0;i<number; i++) {
				System.out.println("=");
			}
		}
		sc.close();
	}
}
