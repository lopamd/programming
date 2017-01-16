package com.java.prog.string;
//Return maximum occurring character in the input string

public class Max_char_inString {
	public static void main(String[] args){
	String input = "lopammuMmrMMqaaa";
	char result = max_occuring_char(input);
	System.out.println("Maximum occuring character in string is : " + result);
	}

	private static char max_occuring_char(String string) {
		int hash_index = 0;
		if(string.length() == 0 || string == null)
			System.out.println("Invalid/null string");
		if(string.length() == 1)
			return string.charAt(0);
		char [] s = string.toCharArray();
		int[] count = new int[256];
		int length = string.length();
		for(int i = 0 ; i < length ; i++){
			if(64 < (int) s[i] && (int) s[i] < 91){
				hash_index = (int) s[i] + 32;
			} else {
				hash_index = (int) s[i];
			}
			count[hash_index]++;
			//System.out.println(count[s[i]]);
		}
		
		int max = -1;
		char result = '\0';
//* Print all the duplicates in the input string
		int j = 0;
		/*while(j < length){
			if(count[s[j]] > 1){
				System.out.print(s[j]);
				count[s[j]] = 0;
			}
			j++;
		}*/

		for(j = 0 ; j < count.length ; j++){
			if(count[j] > 1)
				System.out.println((char) j + " ");
		}
//*
		for(int i = 0; i < length; i++){
			//System.out.println(count[s[i]]);
			if(max < count[s[i]]){
				//System.out.println(count[s[i]]);
				max = count[s[i]];
				result = s[i];
			}
		}
			
		System.out.println("Max count of repeating character is : " + max);
		return result;
	}
}
