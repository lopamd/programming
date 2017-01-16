package com.java.prog.matrix;
/*Turn an image by 90 degree */

public class Rotate_by_90 {
	public static void main(String[] args) {
		int[][] input = {{1,2,3,4}, 
            		  {5,6,7,8},
            		  {9,10,11,12}		
					 };
		rotate_90_degree(input);
	}

	public static void rotate_90_degree(int[][] input) {
		if((input == null) || (input.length == 0))
			return;
		int length = input.length;
		int temp;
		/*for(int i = 0; i < length/2; i++){
			for(int j = 0; j < Math.ceil(((double)length)/2) ; j++){
				temp = input[i][j];
				input[i][j] = input[length-1-j][i];
				input[length-1-j][i] = input[length-1-j][length-1-j];
				input[length-1-j][length-1-j] = input[j][length-1-j];
				input[j][length-1-j] = temp;
			}
		}*/
		int R = length;
		int C = input[0].length;
		int[][] result = new int[C][R];
		for(int i = 0; i < R; i++){
			for(int j = 0; j < C; j++){
				result [j][R - i - 1] = input [i][j];
			}
		}
		for (int i = 0; i < C; i++) {
		    for (int j = 0; j < R; j++) {
		    	System.out.print(result[i][j] + " ");
		    }
		    System.out.print("\n");
		}
	}
}
