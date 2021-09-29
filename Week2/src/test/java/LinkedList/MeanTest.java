package LinkedList;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MeanTest {

	@Test
	public void test() {
	//?Mean test1 = new Mean();

		ArrayList<Integer> value = new ArrayList<Integer>();
		value.add(2);
		value.add(3);
		value.add(4);
		//value.add(0);
	
		double result = Mean.harmMean(value);		
		assertEquals(2.76, result, 0.0);
	}
	@Test
	public void test1() {
		
		ArrayList<Integer> value = new ArrayList<Integer>();
		value.add(2);
		value.add(3);
		value.add(4);
		//value.add(0);
	
		double result = Mean.arithMean(value);		
		assertEquals(3.0, result, 0.0);
	}
	@Test
	public void test2() {
		
		ArrayList<Integer> value = new ArrayList<Integer>();
		value.add(2);
		value.add(3);
		value.add(4);
		//value.add(0);
	
		double result = Mean.geomMean(value);		
		assertEquals(2.88, result, 0.0);
	}

}
