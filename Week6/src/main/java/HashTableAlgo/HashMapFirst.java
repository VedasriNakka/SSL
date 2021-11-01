package HashTableAlgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class HashMapFirst {
	public interface SimpleKV<K, V>{
		public void put(K k, V v);
	}
	
	

	public static void main(String[] args) {
		Map<String, Integer> m = new Hashtable<String, Integer>() ;
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		
		long startTime = System.nanoTime();
		
		lh.put("a", 10);
		lh.put("b", 20);
		lh.put("c", 30);
		lh.put("d", 40);
		lh.put("e", 50);
		lh.put("e", 60);
		lh.put("e", 50);
		
		System.out.println("key: "+ lh.get("a"));
		System.out.println(lh);
		
		for (String i : lh.keySet()) {
			  System.out.println("key: " + i + " value: " + sv);
		}
		
		long entTime = System.nanoTime();
		long totalTime = (entTime - startTime) / 1000000L;
		System.out.println("Executed in " + totalTime + " ms");
		
		Set<String> uniKeys = new HashSet<String>();
		for (String i : lh.keySet()) {
			uniKeys.add(i);
		}
		System.out.println(uniKeys);
		System.out.println("key: "+ lh.get("e"));
	}

}
