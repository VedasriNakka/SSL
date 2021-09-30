package LinkedList;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MatrixTest {

	@Test
	public void test() {
		
		double[][] num1 =  new double[][] {{1, 2},{2,1}};
		Matrix test1 = new Matrix(2, 2, num1);
		
		Matrix test2 = new Matrix(2, 2, new double[][] {{1, 2},{2,1}});
		Matrix expected1 = new Matrix(2, 2, new double[][] {{2, 4},{4,2}});
		Matrix expected2 = new Matrix(2, 2, new double[][] {{5, 4},{4,5}});
		
		Matrix predicted1 = test1.add(test2);
		Matrix predicted2 = test1.product(test2);
		
		//expected.print_matrix();
		//predicted.print_matrix();
		
		//Arrays.deepEquals(expected.mat, predicted.mat);
		assertArrayEquals(expected1.mat, predicted1.mat);
		assertArrayEquals(expected2.mat, predicted2.mat);
	}
}
