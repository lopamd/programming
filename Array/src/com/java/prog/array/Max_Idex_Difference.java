package com.java.prog.array;
//Given an array arr[], find the maximum j � i such that arr[j] > arr[i]
public class Max_Idex_Difference {
	public static void main(String[] args){
		//int[] input = {34, 35, 36, 37, 33, 1};
		int[] input = {1,2,3,4,5,4,3,2,1};
	    //int input[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
		//int[] input = {34, 8, 10, 3, 2, 80, 30, 33, 1};

		int index_difference = maximum_index_diff(input);
		System.out.println(index_difference);
	}

	private static int maximum_index_diff(int[] arr) {
		if(arr.length == 0 || arr == null)
			return -1;
		int i = 0 , j = arr.length - 1;
		while(i < j){
			if(arr[j] > arr[i])
				return j - i;
			if((arr[i] - arr[i + 1]) >= arr[j - 1] - arr[j])
				i++;
			else
				j--;
			
		}
		return -1;
	}
}
