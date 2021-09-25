import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
	public static void main(String args[]) throws IOException {
		File readFile = new File("C:\\Users\\Veda\\Desktop\\Test.txt"); //Reading Text file
		Scanner sc = new Scanner(readFile);
		System.out.println(sc);
		FileWriter writeFile = new FileWriter("C:\\Users\\Veda\\Desktop\\Test3.txt"); // Copy into Test3 file
		
		while(sc.hasNext()){		//Reading each line by using Scanner 
			String line = sc.nextLine();
			writeFile.write(line);
			writeFile.write("\n");
		}
		writeFile.close();			// closing writeFile
		sc.close();					// closing sc
	}
}
