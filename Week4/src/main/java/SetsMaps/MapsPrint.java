package SetsMaps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapsPrint {
	public static void main(String args[]) throws IOException {
		File readFile =  new File("D:\\Eclipse\\Week4\\src\\main\\resources\\javaMaps.csv");
		FileReader fr = new FileReader(readFile);
		BufferedReader br = new BufferedReader(fr);
		String line ;
		
		Hashtable<String, String> hstable = new Hashtable<String, String>();
		HashMap<String, String> hsmap = new HashMap<String, String>();
		LinkedHashMap<String, String> lshashmap = new LinkedHashMap<String, String>();
		TreeMap<String, String> treemap = new TreeMap<String, String>();
		ConcurrentHashMap<String, String> curr = new ConcurrentHashMap<String, String>();
		
		while((line = br.readLine()) != null) {
			//System.out.println(line.toString()+ "\n");
			String S[] = line.split(",");
			System.out.println(S[0] +" : "+ S[1]);
			//System.out.println("\n");
			
			hstable.put(S[0], S[1]);
			hsmap.put(S[0], S[1]);
			lshashmap.put(S[0], S[1]);
			treemap.put(S[0], S[1]);
			curr.put(S[0], S[1]);
			//List<String> groceries = Arrays.asList("Potatoes", "Ketchup", "Eggs");
			
		}
		System.out.println("\n");
		hstable.forEach((key,value) -> System.out.println(key + ":" + value));
		System.out.println("\n");
		System.out.println("Hashmap:" + hsmap + "\n"); // is faster
		System.out.println("LinkedHashmap:" + lshashmap + "\n");
		System.out.println("TreehMap:" + treemap + "\n");
		System.out.println("ConcurrentHashMap:" + curr + "\n");
		
//		for(String keyValue: curr) {
//			System.out.println(keyValue);
//		}
//		Iterator<String> words = curr.iterator();
//		while(words.hasNext()) {
//			System.out.println(words.next());
//		}
		
	}
}
