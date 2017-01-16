package com.java.prog.string;
//Remove characters from the first string which are present in the second string
public class Remove_char_fromSecString {

	private static void Remove_Dirty_chars(String sFirst, String sSecond) {
		boolean[] seen = new boolean[256];
		char[] first_arry = sFirst.toCharArray();
		char[] sec_array = sSecond.toCharArray();
		for(int i = 0; i < sSecond.length(); i++){
			if(seen[sec_array[i]] == false)
				seen[sec_array[i]] = true;
		}
		for(int i = 0; i < sFirst.length(); i++){
			if(seen[first_arry[i]] == false)
				System.out.print(first_arry[i]);
		}
	}
	
	public static void main(String[] args){
		String sFirst = "geeksforgeeks";
		String sSecond = "mask";
		Remove_Dirty_chars(sFirst, sSecond);
		
	}

}
