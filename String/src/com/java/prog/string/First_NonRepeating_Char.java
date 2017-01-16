package com.java.prog.string;
/**
 * Given a string, find its first non-repeating character
 */
public class First_NonRepeating_Char {
	public static void main(String[] args){
		String input = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
		System.out.println("Output : " + getFirstNonrepeatingCharacter(input));
	}

	private static Character getFirstNonrepeatingCharacter(String input) {
		if(input == null || input.length() == 0)
		return null;
		int length = input.length();
		if(length == 1)
			return input.charAt(0);
		
		int[] charIndex = new int[256];
		int i;
		for(i = 0 ; i < 256 ; i++){
			charIndex[i] = -1;
		}
		
		for(i = 0; i < length ; i++){
			if(charIndex[input.charAt(i)] == -1){
				charIndex[input.charAt(i)] = i;
			}else
				charIndex[input.charAt(i)] = -2;
		}
		int min_index = length;
		for(i = 0 ; i < 256 ; i++){
			if(charIndex[i] > -1 && min_index > charIndex[i]){
				min_index = charIndex[i];
			}
		}
		return input.charAt(min_index);	
	}
}
