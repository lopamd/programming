package com.java.prog.string;

import java.util.Arrays;

public class test_string {
	public static void main(String[] args) {
		int[] table = new int[26];
		String s = "tactcoa";
		char[] chararr = s.toCharArray();
		int mask = 1 << 4;
		System.out.println("mask ="+ mask);
		for(int i = 0; i< s.length();i++){
			table[chararr[i] - 'a']++;
			//System.out.println(table[chararr[i] - 'a']);
		}
		System.out.println(Arrays.toString(table));
	}
}
