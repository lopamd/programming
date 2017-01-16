package com.java.prog.matrix;
//Print a given matrix in spiral form
public class Print_in_Spiral {
	public static void main(String[] args) {
		int matrix[][] = { {1,  2,  3,  4,  5,  6},
						   {7,  8,  9,  10, 11, 12},
						   {13, 14, 15, 16, 17, 18},
						   {19, 20, 21, 22, 23, 24}
						 };
		print_spiral(matrix);
	}

	public static void print_spiral(int[][] matrix) {
		int R = matrix.length;
		int C = matrix[0].length;
		int start_indx_row = 0;
		int start_indx_col = 0;
		int i;
		while(start_indx_row < R && start_indx_col < C){
			for(i = start_indx_col ; i < C; i++){
				System.out.print(matrix[start_indx_row][i] + " ");
			}
			start_indx_row++;
			
			for(i = start_indx_row; i < R; i++){
				System.out.print(matrix[i][C - 1] + " ");
			}
			C--;
			
			if(start_indx_row < R){
				for(i = C - 1; i >= start_indx_col; i--){
					System.out.print(matrix[R-1][i] + " ");
				}
			}
			R--;
			
			if(start_indx_col < C){
				for(i = R - 1; i >= start_indx_row; i--){
					System.out.print(matrix[i][start_indx_col] + " ");
				}
				start_indx_col++;
			}
		}
	}
}
