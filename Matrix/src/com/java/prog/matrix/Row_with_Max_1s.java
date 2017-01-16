package com.java.prog.matrix;
/**
 *Find the row with maximum number of 1s
 *Sorted matrix
 */
public class Row_with_Max_1s {
	public static void main(String[] args) {
		int mat[][] = { {0, 0, 0, 0},
		        		{0, 1, 1, 1},
		        		{0, 1, 1, 1},
		        		{0, 0, 0, 0}
		    		  };
		System.out.println("Index of the Row with Maximum 1s is : " + get_MaxRow_1s(mat));
	}
	

	/*Binary search for index of first 1 in a row */
	public static int first_binary_search(int arr[], int low, int high){
		if(high >= low){
			int mid = low + (high - low) / 2;

			if((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1)
				return mid;
			else if(arr[mid] == 0)
				return first_binary_search(arr, low, mid - 1);
			else
				return first_binary_search(arr, mid + 1, high);
		}
		return -1;
	}

	public static int get_MaxRow_1s(int[][] mat) {
		int max_row_index = 0;
		int R = mat.length;
		int C = mat[0].length;
		int j = first_binary_search(mat[0], 0, C - 1);
		if(j == -1)
			j = C - 1;
		for(int i = 1; i < R; i++){
			while(j >= 0 && mat[i][j] == 1)
			{
				j--;
				max_row_index = i;
			}
		}
		return max_row_index;
	}
	
}
