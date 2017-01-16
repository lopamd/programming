package com.java.prog.array;
import java.util.Arrays;

//Segregate Even and Odd numbers
public class Segregate_EvenOdd {
	
	private static void segregateEvenOdd(int[] arr) {
		int l = arr.length;
		int left = 0 , right = l-1;
		while(left < right)
		{
			while(arr[left]%2 == 0 && left < right){
				left++;}
			
			while(arr[right]%2 == 1 && left < right){
				right--;}
			
			if(left < right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}
	public static void main(String[] args){
		int[] input = { 12, 23, 43, 56, 90, 11};
		System.out.println("The input array : " + Arrays.toString(input));
		segregateEvenOdd(input);
		System.out.println("The segregated array : " + Arrays.toString(input));

		
	}
}
