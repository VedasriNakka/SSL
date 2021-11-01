package HashTableAlgo;

import java.util.Random;

public class ExampleMap {
	public static void main(String args[]) {
		Random rd = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int targetStringLength = 10;
		StringBuilder std = new StringBuilder(targetStringLength);
		int temp =0;
		
		long startTime = System.nanoTime();
		while(temp < bs) {
			temp = kvl.getLength();
			int randomLength= (int)(Math.random()*10+1);
			for(int i=0; i< randomLength; i++) {
				int index = rd.nextInt(alphabet.length());
				char randomChar = alphabet.charAt(index);
				std.append(randomChar);
			}
			String randomString = std.toString();
			int randomNum = rd.nextInt();
			kvl.put(randomString, randomNum);
		}
		long entTime = System.nanoTime();
		long totalTime = (entTime - startTime) / 1000000L;
		System.out.println("Executed in " + totalTime + " ms");
	}
	

}
