package com.java.prog.string;
import java.util.Arrays;

/**
 * Print reverse of a string using recursion
 */

public class Reverse_string_recursion {
	public static void main(String[] args){
		String input = "Lopamudra";
		int length = input.length();
		String result = reverse(input, 0, length - 1);
		System.out.println(result);
	}
	public static String reverse(String input ,int start, int end ) {
		char[] arr = input.toCharArray();
		if(start == end || end < start){
			return String.valueOf(arr);
		}
		else{
			swap(arr, start, end);
			//String revStr = String.valueOf(arr);
			//System.out.println(revStr);
			return reverse(String.valueOf(arr), start + 1, end - 1);
		}
//		return reverse(input.substring(1)) + input.charAt(0);
	}
	
	public static void swap(char[] str, int first , int last){
		char temp = str[first];
		str[first] = str[last];
		str[last] = temp;
		
	}
}
