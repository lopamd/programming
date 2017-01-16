package com.java.prog.array;
import java.util.Arrays;

//Longest Increasing Subsequence Size (N log N)
public class Size_LongestSubSequence {
	public static void main(String[] args){
		//int[] input = {2, 5, 3, 7, 11, 8, 10, 13, 6};
		//int[] input = {3, 1, 5, 2, 6, 4, 9};
		//int[] input =  {10, 22, 9, 33, 21, 50, 41, 60 };
		int[] input = {2, 6, 3, 4, 1, 2, 9, 5, 8};
		//int[] input = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int size = input.length;
		int lsslength = length_longest_subseq(input, size);
		System.out.println("The maximum length of subsequence is : " + lsslength);
	}
	private static int length_longest_subseq(int[] arr, int size) {
		if(size == 1)
			return 1;
		if(size == 0 || arr == null){
			System.out.println("Invalid/null array");
			return Integer.MAX_VALUE;
		}
		int[] subSequence = new int[size];
		int length_subSequence;
		
		subSequence[0] = arr[0];
		length_subSequence = 1;
		for(int i = 1 ; i < size ; i++){
			if(arr[i] < subSequence[0] && i != (size - 1))
				subSequence[0] = arr[i];
			else if(arr[i] > subSequence[length_subSequence - 1]){
				subSequence[length_subSequence++] = arr[i];
			}
			else if(i != (size - 1))
				subSequence[place_throughBinarySearch(subSequence, 1, length_subSequence, arr[i])] = arr[i];
		}
		int[] removedNull = Arrays.copyOf(subSequence, length_subSequence);
		System.out.println(Arrays.toString(removedNull));
		//System.out.println(Arrays.toString(subSequence));
		return length_subSequence;
	}

	private static int place_throughBinarySearch(int[] arr, int low, int high, int key) {
		while(high > low)
		{
			int mid = low + (high - low) / 2;
			if(arr[mid] <= key){
				low = mid + 1;
			}
			else 
				high = mid;
		}
		return low;
	}
}
