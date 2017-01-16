package com.java.prog.bit;
/**
 *Write an Efficient C Program to Reverse Bits of a Number
 */
public class Reverse_EachBit_OfaNumber {
	public static void main(String[] args) {
		int n = 1;
		System.out.println(Integer.toString(n, 2));
		
		int reverse = get_ReverseBits(n);
		System.out.println("*** Reverse in Binary ***" + Integer.toString(reverse, 2));
		
		System.out.println("*** Reverse in decimal ****" + reverse);
		System.out.println("*** compliment" + ~n);
	}

	private static int get_ReverseBits(int n) {
		int NO_OF_BITS = 32;
		for(int i = 0; i < NO_OF_BITS; i++){
			n = n ^ (1 << i);
		}
		return n;
	}
}
