package HashTableAlgo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class SimpleKVImple implements SimpleKV<String, Integer> {
	
	LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
	int maxlength;
	int svsize;
	
	Random random = new Random();
	
	public SimpleKVImple(int maxlength){
		this.maxlength = maxlength;
		this.svsize = 0;
	}
	public void put(String k, Integer v) {
  	    
		if(svsize == maxlength) {
			String randomkey = get_randomkey();
			remove_key(randomkey);	
		}		
		lhm.put(k, v);
  	    svsize++;
	}

	public Integer get(String k) {
		return lhm.get(k);
		//return k;
	}
	public String get_randomkey() {
		List<String> keysAsArray = new ArrayList<String>(lhm.keySet());		
		String randomkey =  keysAsArray.get(random.nextInt(keysAsArray.size()));
		return randomkey;
	}
	
	public void remove_key(String key) {
		lhm.remove(key);
		svsize--;
	}
	
	public void print() {
		for (String key : lhm.keySet()) {			
			System.out.println("key: " + key + " value: " + get(key));
		}
		
	}

}
