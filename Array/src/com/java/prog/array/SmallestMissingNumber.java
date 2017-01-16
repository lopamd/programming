package com.java.prog.array;
//Find the smallest missing number
public class SmallestMissingNumber {
	public static int smallest_Mnumber(int[] arr, int start, int end){
		if(start > end)
			return end + 1;
		if(start != arr[start])
			return start;
		int mid = (start + end) / 2;
		if(arr[mid] > mid)
			return smallest_Mnumber(arr, start, mid);
		else
			return smallest_Mnumber(arr, mid + 1, end);
	}
	
	public static void main(String[] args){
		int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8 , 9};
		int missing_elemnt = smallest_Mnumber(input, 0, input.length - 1);
		System.out.println("The smallest missing element in the array is : " + missing_elemnt);
	}
}
