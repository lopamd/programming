package com.java.prog.string;
/**
 *Print list items containing all characters of a given word
 */
public class Item_having_AllCharofAWord {
	public static void main(String[] args) {
		String input = "sun";
		String list[] = {"geeksforgeeks", "unsorted", "sunday", "just", "sss" };
		print_item(input, list);
	}

	private static void print_item(String input, String[] list) {
		if(input == null || input.length() == 0 || list == null)
			return;
		int[] charValue = new int[256];
		int i,j,count = 0;
		int word_length = input.length();
		for(i = 0; i < input.length(); i++){
			charValue[input.charAt(i)] = 1;
		}
		for(i = 0; i < list.length ; i++){
			for(j = 0; j < list[i].length(); j++){
				if(charValue[list[i].charAt(j)] == 1){
					charValue[list[i].charAt(j)] = 0;
					count++;
				}
			}
			if(count == word_length)
				System.out.println(list[i]);
			count = 0;
			
			for(j = 0; j < input.length(); j++){
				charValue[input.charAt(j)] = 1;
			}
		}
		
	}
	
}
