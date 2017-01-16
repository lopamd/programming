package com.java.prog.string;
/**
 *Reverse words in a given string
 */

public class Reverse_words_In_A_string {
	public static void main(String[] args) {
		String input = "I love You";
		reverse_words(input);
	}

	public static void reverse_words(String input) {
		String str = input;
		int start = 0;
		for(int i = 0; i < str.length() ; i++){
			if(input.charAt(i) == ' ' && i > 0){
				str = Reverse_string_recursion.reverse(str, start, i - 1);
				start = i + 1;
			}else if(i == str.length() - 1){
				str = Reverse_string_recursion.reverse(str, start, i);
			}
		}
		String output = Reverse_string_recursion.reverse(str, 0, str.length() - 1);
		System.out.println("Input : " + input + "\n" + "Output : " + output);
	}
}
