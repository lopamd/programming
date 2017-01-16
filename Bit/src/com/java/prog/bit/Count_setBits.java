package com.java.prog.bit;
/**
 *n = n & (n – 1) clears the least significant bit set.
 *Count set bits in an integer (Brian Kernighan’s Algorithm)
 */
public class Count_setBits {
	public static void main(String[] args) {
		int number = 16;
		System.out.println("Given Number = " + number + "(" + Integer.toBinaryString(number) + ")");
		System.out.println("The number of set bit in given number is : " + get_count_of_setBits(number));
	}

	private static int get_count_of_setBits(int number) {
		int count_setBit = 0;
		while(number != 0){
			number = number & (number - 1);
			count_setBit++;
		}
		return count_setBit;
	}
}
