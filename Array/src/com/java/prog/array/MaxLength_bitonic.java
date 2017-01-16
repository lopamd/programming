package com.java.prog.array;
//Maximum Length Bitonic Subarray
public class MaxLength_bitonic {
	public static void main(String[] args){
		//int[] input =  {12, 4, 78, 90, 45, 23};
		//int[] input = {20, 4, 1, 2, 3, 4, 2, 10};
		int[] input = {10, 20, 30, 40};
		int length_bitonic = LengthOf_bitonicSubarr(input);
		System.out.println("The bitonic subarray length is : " + length_bitonic);
	}

	private static int LengthOf_bitonicSubarr(int[] input) {
		int n = input.length;
		int i = 0;
		int max_length = 1;
		while (i < n-1){
			int count = 1;
			while(i < (n - 1) && (input[i] < input[i + 1])){
				count++;
				i++;
			}
			while(i < (n - 1) && (input[i] > input[i + 1])){
				count++;
				i++;
			}
			if(count > max_length){
				max_length = count;
				//System.out.println("length = " + max_length );
			}
		}
		return max_length;
	}

}
