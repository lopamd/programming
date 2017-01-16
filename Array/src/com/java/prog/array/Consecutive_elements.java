package com.java.prog.array;
//Check if array elements are consecutive
public class Consecutive_elements {
	public static boolean check_consecutive(int[] arr){
		if(arr.length < 1)
			return false;
		if(arr.length == 1){
			System.out.println("Array contains insufficient elements");
			return false;
		}
		
		int max_number = max_element(arr);
		int min_number = min_element(arr);
		
		if(max_number - min_number + 1 == arr.length){
			for(int i = 0; i < arr.length; i++){
				int j;
				if(arr[i] < 0)
					j = -arr[i] - min_number;
				else
					j = arr[i] - min_number;
				
				if(arr[j] > 0)
					arr[j] = -arr[j];
				else
					return false;
			}
			return true;
		}
		return false;
	}

	private static int max_element(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	private static int min_element(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length ; i++){
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("min element : " + min);
		return min;
	}
	
	public static void main(String[] args){
		int[] input = {5, 2, 3, 6, 1, 4};
		//int input[] = {83, 78, 80, 81, 79, 82};
		if(check_consecutive(input) == true)
			System.out.println("The elements in the array are consecutive");
		else
			System.out.println("The elements in the array are not consecutive");
	}
}
