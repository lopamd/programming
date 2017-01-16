package com.java.prog.bit;
/**
 *Rotate bits of a number
 */
public class Rotation_of_Bits {
	public static void main(String[] args) {
		int n = 16;
		int shift = 2;
		int left_shift = left_rotate(n , shift);
		int right_shift = right_rotation(n, shift);
		System.out.println("Left shift " + Integer.toBinaryString(n) + "(" + n + ")" + "----->" +
							Integer.toBinaryString(left_shift) + "(" + left_shift + ")");
		
		System.out.println("Right shift " + Integer.toBinaryString(n) + "(" + n + ")" + "----->" +
				Integer.toBinaryString(right_shift) + "(" + right_shift + ")");
	}

	public static int left_rotate(int n, int shift) {
		return (n << shift) | (n >> (Integer.SIZE - shift));
	}
	
	public static int right_rotation(int n, int shift){
		return (n >> shift) | (n << (Integer.SIZE - shift));
	}
}
