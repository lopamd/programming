package com.java.prog.bit;
/**
 *Find the two non-repeating elements in an array of repeating elements
 *n & (n -1) shedoff the right most set bit
 *n & ~(n - 1) will keep only the right most set bit
 */
public class Two_NonRepeating_integer_InaArray {
	public static void main(String[] args) {
		int[] arr = {2, 3, 7, 9, 11, 2, 3, 11};
		get_Two_repeating_int(arr, arr.length);
	}

	public static void get_Two_repeating_int(int[] arr, int length) {
		int xor = 0, i;
		int number1 = 0;
		int number2 = 0;
		for(i = 0 ; i < length; i++){
			xor ^= arr[i];
		}
		int LAST_SET_BIT = xor & ~(xor - 1);
		for(i = 0 ; i < length ; i++){
			if((arr[i] & LAST_SET_BIT) != 0)
				number1 = number1 ^ arr[i];
			else
				number2 = number2 ^ arr[i];
		}
		System.out.println("Two non_repeating numbers are : " + number1 + " and " + number2);
	}
}
