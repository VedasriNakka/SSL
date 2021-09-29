package LinkedList;

import java.util.*;

public class Matrix {
	
	int rows, cols;
	
	public double[][] mat;
	Matrix(int r, int c){
		rows = r;
		cols = c;
		mat = new double[rows][cols];		
	}
	
	public void get_input(){
		Scanner s = new Scanner(System.in);
		int i=0,j=0;
		
		System.out.println("Enter the matrix elements(row-wise)");
		for (i=0; i < rows; i++) {
			for(j=0; j<cols; j++){
				mat[i][j] = s.nextDouble();
			}
		}
		s.close();
	}

	//function to print matrix 
	public void print_matrix()
	{
		int i = 0, j = 0;
		System.out.println("The matrix is:>>");
		for (i = 0; i < rows; i++){
			System.out.println("");
			for (j = 0; j < cols; j++){
				System.out.print("   "+mat[i][j]);
			}
		}
	}

	public Matrix add(Matrix other){
		Matrix ans = new Matrix(rows ,cols);
		int i=0,j=0;
		if (this.rows != other.rows || this.cols != other.cols){
			System.out.println("ERROR: The two matrices should have same no. of rows and columns for addition!");
		}
		
		else{
			for (i = 0; i < rows; i++){
				for (j = 0; j < cols; j++){
					ans.mat[i][j] = this.mat[i][j] + other.mat[i][j];
				}
			}
		}
		return ans;
	}
}