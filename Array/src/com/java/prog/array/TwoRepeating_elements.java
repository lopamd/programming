package com.java.prog.array;
//Find the two repeating elements in a given array
public class TwoRepeating_elements {
	public static void main(String[] args){
		int[] input = {4, 2, 5, 4, 1, 3, 2, 6, 1, 5, 6};
		System.out.print("Two repeating elements are : ");
		//repeating_2Elements(input);
		abs_RepeatingElements(input);
	}
//2nd method in geeksforgeeks
	private static void repeating_2Elements(int[] arr) {
		int size = arr.length;
		int[] count = new int[size - 2];
		for(int i = 0; i< size; i++){
			if(count[arr[i] - 1] == 1)
				System.out.print(arr[i] + " ");
			else
				count[arr[i] - 1]++;
		}
		
	}

//5th method in geeksforgeeks
	private static void abs_RepeatingElements(int[] arr){
		for(int i = 0 ; i < arr.length; i++){
			if(arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}
}
