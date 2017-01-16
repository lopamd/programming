package com.java.prog.string;
/**
 * Print all interleavings of given two strings
 * An interleaved string of given two strings preserves the order of characters 
 * in individual strings.
 */
public class Interleaving_combination {
	public static void main(String[] args) {
		String str1 = "AB";
		String str2 = "CD";
		print(str1, str2, str1.length(), str2.length());
	}

	public static void print(String str1, String str2, int l1, int l2) {
		char[] output = new char[l1 + l2];
		print_interleaavings(str1, str2, output, l1, l2, 0);
	}

	private static void print_interleaavings(String str1, String str2, char[] output, int l1, int l2, int i) {
		if(l1 == 0 && l2 == 0)
			System.out.println(output);
		if(l1 != 0){
			output[i] = str1.charAt(0);
			print_interleaavings(str1.substring(1), str2, output, l1 - 1, l2, i + 1);
		}
		if(l2 != 0){
			output[i] = str2.charAt(0);
			print_interleaavings(str1, str2.substring(1), output, l1, l2 - 1, i + 1);
		}
	}
}
