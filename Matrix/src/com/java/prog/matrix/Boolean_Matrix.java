package com.java.prog.matrix;
/**
 *A Boolean Matrix Question
	Example 2
	The matrix -----------> should be changed to following
	0 0 0						0 0 1
	0 0 1						1 1 1
 */
public class Boolean_Matrix {
	public static void main(String[] args) {
		int mat[][] = { {1, 0, 0, 1},
		        		{0, 0, 1, 0},
		        		{0, 0, 0, 0},
					  };
		System.out.println("Input Matrix ");
		print_Matrix(mat);
		modify_matrix(mat);
		System.out.println("Output Matrix :");
		print_Matrix(mat);
	}

	public static void print_Matrix(int[][] mat) {
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[0].length; j ++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void modify_matrix(int[][] mat){
		boolean firstRow = false;
		boolean firstCol = false;
		int R = mat.length;
		int C = mat[0].length;
		int i,j;
		for(i = 0; i < C; i++){
			if(mat[0][i] == 1)
				firstRow = true;
		}
		
		for(i = 0; i < R; i++){
			if(mat[i][0] == 1)
				firstCol = true;
		}
		
		for(i = 1; i < R; i++){
			for(j = 1; j < C; j++){
				if(mat[i][j] == 1){
					mat[i][0] = 1;
					mat[0][j] = 1;
				}
			}
		}
		
		for(i = 1; i < R; i++){
			for(j = 1; j < C; j++){
				if(mat[i][0] == 1 || mat[0][j] == 1){
					mat[i][j] = 1;
				}
			}
		}
		
		if(firstCol){
			for(i = 0; i < R; i++)
				mat[i][0] = 1;
		}
		
		if(firstRow){
			for(i = 0; i < C; i++)
				mat[0][i] = 1;
		}
		
	}
}
