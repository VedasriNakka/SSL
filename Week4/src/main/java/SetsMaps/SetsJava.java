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
		File readfile = new File("D:\\Eclipse\\Week4\\src\\main\\resources\\setsjava.txt");	//loading file
		Scanner sc = new Scanner(readfile);
		
		//MultiMap<String> multiset = HashMultiset.create();
		Bag<String> bag = new HashBag<>();
		String S[] = null;
		
		while(sc.hasNext()) {
			String input = sc.next();
			S = input.split(" ");		//splitting values
			
			for(int i=0; i < S.length; i++) {
				bag.add(S[i]);			//adding values to bag
			}			
		}
		System.out.println(bag + "\n");
		
		int max = 0;
		int c = 0;
		String freq_word="";
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(String word: bag) {			
			c = bag.getCount(word);			
			if(max < c) {
				max = c;
				freq_word= word;				
			}
		}
		System.out.println("max count: " + max + ", the word is: "+ freq_word);	
		//hm.put(freq_word, max);
		
		int i = max;
		
		while(i>0) {
			for(String max_words: bag) {
				//System.out.println(max_words);
				if((i == bag.getCount(max_words)  && !hm.containsKey(max_words))) {
					hm.put(max_words, bag.getCount(max_words));
					System.out.println("word: " + max_words + ", count:" + bag.getCount(max_words));
				}
				if(hm.size() == 3) {
					break;
				}				
			}			
			i= i-1;
			if(hm.size() == 3) {
				break;
			}
		}	
	}
}
