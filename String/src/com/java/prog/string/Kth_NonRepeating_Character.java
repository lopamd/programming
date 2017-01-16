package com.java.prog.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Kth_NonRepeating_Character {
	public static char kth_non_repeatingchar(String s, int position) {
		if(s == null)
			return '\0';
		char[] StringArr = s.toCharArray();
		int[] index = new int[256];
		for(int i =0; i < 256; i++)
			index[i] = -1;
		for(int j = 0; j < s.length(); j++){
			if(index[StringArr[j]] == -1)
				index[StringArr[j]] = j;
			else
				index[StringArr[j]] = -2;
		}
		ArrayList<Integer> nonrepeating = new ArrayList<>();
		for(int p = 0; p < 256; p++){
			if(index[p] > -1) {
				nonrepeating.add(index[p]);
				//System.out.println(s_nonRepeating[p] + ":" + index[p]);
			}
		}
		Collections.sort(nonrepeating);
		return s.charAt(nonrepeating.get(position - 1));
	}
	public static void main(String[] args) {
		String S = "geeksforgeeks";
		int pos = 2;
		System.out.println("The position of "+ pos + "th non-repeating character is : " + kth_non_repeatingchar(S, pos));
	}

	
}
