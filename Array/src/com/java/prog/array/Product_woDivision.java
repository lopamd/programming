package com.java.prog.array;
import java.util.Arrays;

/*A Product Array Puzzle without division operator
	arr[] = {10, 3, 5, 6, 2}
	prod[] = {180, 600, 360, 300, 900}*/
public class Product_woDivision {
	
	private static int[] product_withoutItself(int[] arr) {
		if(arr == null && arr.length == -1)
			return arr;
		else{
			if(arr.length == 1)
				return new int[] {0};
			else if(arr.length == 2){
				return new int[] {arr[1], arr[0]};
			}
		}
		
		int[] res = new int[arr.length];
		res[0] = 1;
		int temp = 1;
		for(int i = 0 ; i < arr.length ; i++){
			res[i] = temp;
			temp = temp * arr[i];
		}
		temp = 1;
		for(int i = arr.length - 1 ; i >= 0 ; i--){
			res[i] = res[i] * temp;
			temp = temp * arr[i];
		}
		
		return res;
	}
	
	public static void main(String[] args){
		//int[] input = {2, 5, 10, 11};
		int[] input = {10, 3, 5, 6, 2};
		System.out.println("The input array : " + Arrays.toString(input));
		int[] result = product_withoutItself(input);
		System.out.println("The resultant array : " + Arrays.toString(result));
	}

	
}
