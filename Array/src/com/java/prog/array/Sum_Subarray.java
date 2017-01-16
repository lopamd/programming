package com.java.prog.array;
//Find subarray with given sum
public class Sum_Subarray {
	public static void main(String[] args){
		//int[] input = {1, 4, 20, 3, 10, 5};
		int input[] = {15, 2, 4, 8, 9, 5, 10, 23};
		int sum = 23;
		subArraySum(input , sum);
	}

	private static void subArraySum(int[] arr, int sum) {
		int length = arr.length;
		if(length == 0 || (length == 1 && arr[0] != sum))
			return;
		int curr_sum = 0;
		int start = 0;
		for(int i  = 0 ; i < length ; i++){
			curr_sum = curr_sum + arr[i];
			while(curr_sum > sum && start < i){
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if(curr_sum == sum){
				System.out.println("Sum found between indexes " + start + " and " + i);
				return;
			}
		}
		System.out.println("No subarray found");
		return;
	}
}
