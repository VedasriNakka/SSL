package LinkedList;

import java.util.*;

public class Matrix {
	
	int rows;
	int cols;	
	public double[][] mat;
	
	public Matrix(int r, int c){
		rows = r;
		cols = c;
		mat = new double[rows][cols];		
	}
	
	public Matrix(int r, int c, double[][] num){
		rows = r;
		cols = c;
		mat = new double[rows][cols];
		this.mat = num;
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
		//s.close();
	}

	//function to print matrix 
	public void print_matrix(){
		int i = 0, j = 0;
		System.out.println("The matrix is:");
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
	
	public Matrix product(Matrix other){
		Matrix ans = new Matrix(rows,cols);
		int i=0,j=0, k=0;
		if (this.rows != other.rows || this.cols != other.cols)
		{
			System.out.println("ERROR: The two matrices should have same no. of rows and columns for subtraction!");
		}
		else
		{
			for (i = 0; i < rows; i++)
			{
				for (j = 0; j < cols; j++)
				{
					for(k = 0; k < rows; k++) {
						
						ans.mat[i][j] += this.mat[i][k] * other.mat[k][j];
					}
				}
			}
		}
		return ans;
	}
//}


//class MatRes
//{

	public static Matrix m1,m2,ans;
	public static void main(String args[]){
		int i = 0, j = 0,r=0,c=0;
		Scanner s = new Scanner(System.in);

		//get the no. of rows and columns of the matrix from the user
		System.out.println("Enter no. of rows:");
		r = s.nextInt();
		System.out.println("Enter no. of columns:");
		c = s.nextInt();

		//accept the first matrix
		System.out.println("Enter the first matrix:");
		m1 = new Matrix(r,c);
		m1.get_input();

		//accept the second matrix
		System.out.println("Enter the second matrix:");
		m2 = new Matrix(r,c);
		m2.get_input();

		//Add the 2 matrices and print the result
		ans = m1.add(m2);
		System.out.println("\nAddition of the two matrices is:");
		ans.print_matrix();

		//Product the 2 matrices and print the result
		ans = m1.product(m2);
		System.out.println("\nMultiplication of the two matrices is:");
		ans.print_matrix();
	
	}

	
}
