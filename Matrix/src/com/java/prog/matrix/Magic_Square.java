package com.java.prog.matrix;
/**
 * WORKS ONLY FOR ODD NUMBERS
 * A magic square of order n is an arrangement of n^2 numbers,s.t n numbers in all rows,all columns and both 
 * diagonals sum to the same constant. A magic square contains the integers from 1 to n^2.
 * M = n(n^2+1)/2
 * Magic Square of size 3
-----------------------
  2   7   6
  9   5   1
  4   3   8
Sum in each row & each column = 3*(3^2+1)/2 = 15
 */
public class Magic_Square {
	public static void main(String[] args) {
		int n = 6;
		get_magic_square_matrix(n);
	}

	public static void get_magic_square_matrix(int n) {
		int magicS_matrix[][] = new int[n][n];
		/*for position of 1*/
		int i = n/2;
		int j = n - 1;
		
		for(int number = 1; number <= n * n; ){
			if(i == -1 && j == n){
				i = 0;
				j = n - 2; 
			}else{
				if(i < 0)
					i = n - 1;
				if(j == n)
					j = 0;
			}
			if(magicS_matrix[i][j] != 0){
				i++;
				j = j - 2;
				continue;
			}else
				magicS_matrix[i][j] = number++;
			
			i--;
			j++;
		}
		
		// print magic square
	    System.out.println("The Magic Square for " + n + "\n" + "Sum of each row or column : " + n*(n*n+1)/2);
	    for(i=0; i<n; i++)
	    {
	        for(j=0; j<n; j++)
	            System.out.print(magicS_matrix[i][j] + " ");
	        System.out.println("");
	    }
		
	}
}
