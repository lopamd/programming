package com.java.prog.matrix;

//import java.io.InputStreamReader;
//import java.util.Scanner;

/**
 *Maximum size square sub-matrix with all 1s
 */
public class Max_square_subMatrix {
	public static void main(String[] args) {
		 int input[][] = { { 0, 1, 1, 0, 1, 1 },
                 { 1, 1, 0, 1, 1, 1 },
                 { 0, 1, 1, 1, 0, 0 },
                 { 1, 1, 1, 1, 0, 0 },
                 { 1, 1, 1, 1, 1, 0 },
                 { 0, 1, 1, 1, 0, 1 }
               };
		 get_maximum_square_submatrix(input);
		 
		/*Scanner scanner = new Scanner(new InputStreamReader(System.in));
		try{
			System.out.println("Give Row and Column Value");
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			
			int [][] input = new int [m][n];
			System.out.println("Type values of matrix table");
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					input [i][j] = scanner.nextInt();
				}
			}
			get_maximum_square_submatrix(input);
		}finally{
			scanner.close();
		}*/
	}

	public static void get_maximum_square_submatrix(int [][] matrix) {
		
		int maxSize = 0;
		int R = matrix.length;
		int C = matrix[0].length;
		int[][] table = new int[R][C];
		
		for(int i = 0; i < R; i++){
			for(int j = 0; j < C; j++){
				if(i == 0 || j == 0){
					table[i][j] = matrix[i][j];
					maxSize = table[i][j] > maxSize ? table[i][j] : maxSize;
				}
				else if (matrix[i][j] == 0) 
					table[i][j] = 0;
				else{
					table[i][j] = min(table[i - 1][j], table[i][j - 1], table[i - 1][j - 1]) + 1;
					maxSize = table[i][j] > maxSize ? table[i][j] : maxSize;
				}	
			}
		}
		for(int i = 0; i < maxSize ; i++){
			for(int j = 0; j < maxSize; j++){
				System.out.print("1 ");
			}
			System.out.println("");
		}
	}
	
	public static int min(int o, int p, int q){
		return o <= p && o <= q ? o : (p <= o && p <= q ? p : q);
	}
}
