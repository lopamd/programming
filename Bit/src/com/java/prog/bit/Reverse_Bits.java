package com.java.prog.bit;
/**
 *1011 which is equal to decimal 11. I want the reverse bit's location such 
 *that it become 1101, which is decimal 13
 */
public class Reverse_Bits {
	public static void main(String[] args) {
		int n = 11;
		System.out.println("The given number = "+ Integer.toBinaryString(n)+"(" + n + ")");
		System.out.println("The reverse number = "+Integer.toBinaryString(get_reverse_ofNumber(n))
						  + "(" + get_reverse_ofNumber(n) + ")");
	}

	public static int get_reverse_ofNumber(int n) {
		int rev = 0;
		int number = n;
		while(number != 0){
			rev = rev << 1;
			rev = rev | (number & 1);
			number = number >> 1;
		}
		return rev;
	}
}
