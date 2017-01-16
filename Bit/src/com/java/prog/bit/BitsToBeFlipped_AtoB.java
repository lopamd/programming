package com.java.prog.bit;
/**
 *Count number of bits to be flipped to convert A to B
 */
public class BitsToBeFlipped_AtoB {
	public static void main(String[] args) {
		int A = 12;
		int B = 16;
		System.out.println("Given Number = " + A + "("+ Integer.toBinaryString (A) + ")"
				+ " & " + B + "(" + Integer.toBinaryString(B) + ")");
		System.out.println(get_countOf_Flipped_bits(A, B));
	}

	public static int get_countOf_Flipped_bits(int a, int b) {
		int xor = a ^ b;
		int count = 0;
		while(xor != 0){
			xor = xor & (xor - 1);
			count++;
		}
		return count;
	}
}
