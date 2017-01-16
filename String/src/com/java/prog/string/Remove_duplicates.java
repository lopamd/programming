package com.java.prog.string;
import java.util.Arrays;

//Remove all duplicates from a given string
public class Remove_duplicates {
	public static void main(String[] args){
		String input = "geeksforgeeks";
		String result = removeDups(input);
		System.out.println(result);
	}

	private static String removeDups(String input) {
		if(input.length() == 1)
			return input.valueOf(0);
		if(input.length() == 0 || input == null){
			System.out.println("The string should have some value");
			return null; 
		}
		char[] arr = input.toCharArray();
		boolean[] seen = new boolean[256];
		int index = 0;
		//StringBuilder sb = new StringBuilder(arr.length);
		
		for(int i = 0 ; i < arr.length ; i++){
			if(seen[arr[i]] == false){
				arr[index] = arr[i];
				seen[arr[i]] = true;
				index++;
			}		
		}
		String WithoutDup = new String(arr, 0, index);
		return WithoutDup ;
		
	}
}
