package com.java.prog.matrix;
/*Search in a row wise and column wise sorted matrix*/
public class Search_In_Sorted_Matrix {
	public static void main(String[] args) {
		int[][] mat = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		search(mat, 9);
	}

	public static void search(int[][] mat, int search_num) {
		int length = mat.length;
		int i = 0;
		int j = length - 1;
		while(i < length && j >= 0){
			if(mat[i][j] == search_num){
				System.out.println("The number "+ search_num + " found at "+ i +" "+ j);
				return;
			}
			if(mat[i][j] > search_num)
				j--;
			else 
				i++;
		}
		System.out.println("The number "+ search_num + " is not found.");
		return;
	}
}
