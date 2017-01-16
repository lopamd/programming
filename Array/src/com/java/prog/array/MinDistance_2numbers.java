package com.java.prog.array;


//Find the minimum distance between two numbers
public class MinDistance_2numbers {
	public static void main(String[] args){
		//int[] input = {};
		int[] input = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
		int x = 3, y = 6;
		int distance = Numbers_Distacne(input, x, y);
		System.out.println("The minimum distance between " + x + " and " + y + " is " +distance);
	}

	private static int Numbers_Distacne(int[] arr , int x, int y) {
		int length = arr.length;
		if(length == 0){
			System.out.println("Empty array");
			return -1;
		}
		int min_distance = Integer.MAX_VALUE;
		int i = 0;
		int prev = 0;
		for(i = 0 ; i < length ; i++){
			if(arr[i] == x || arr[i] == y){
				prev = i;
				break;
			}
		}
		for( ; i < length ; i++){
			if(arr[i] == x || arr[i] == y){
				if(arr[i] != arr[prev] && min_distance > (i - prev)){
					min_distance = i - prev;
					prev = i;
				}else
					prev = i;
			}
		}
		
		return min_distance;
	}
}
