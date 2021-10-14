package SetsMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;


public class SetsJava {

	public static void main(String[] args) throws IOException {
		File readfile = new File("D:\\Eclipse\\Week4\\src\\main\\resources\\setsjava.txt");
		Scanner sc = new Scanner(readfile);
		
		//MultiMap<String> multiset = HashMultiset.create();
		Bag<String> bag = new HashBag<>();
		String S[] = null;
		
		while(sc.hasNext()) {
			String input = sc.next();
			S = input.split(" ");
			
			for(int i=0; i < S.length; i++) {
				bag.add(S[i]);
			}			
		}
		System.out.println(bag + "\n");
		
		int max = 0;
		int c = 0;
		String freq_word="";
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(String word: bag) {			
			//System.out.println(word +":" + bag.getCount(word));
			c = bag.getCount(word);			
			if(max < c) {
				max = c;
				freq_word= word;				
			}
		}
		System.out.println("max count: " + max + ", the word is: "+ freq_word);	
		hm.put(freq_word, max);
		
		int i = max;
		
		for(String max_words: bag) {
			if(i == bag.getCount(max_words)) {
				hm.put(max_words, bag.getCount(max_words));
			}
			i = i-1;
			hm.put(max_words, i);
			
			if(hm.size() == 3) {
				break;
			}
		}
		
		System.out.println("hm: " + hm);
	}
}
