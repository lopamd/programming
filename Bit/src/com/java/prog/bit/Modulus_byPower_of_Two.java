package com.java.prog.bit;
/**
 *Compute modulus division by a power-of-2-number
 *For example if n = 6 (00..110) and d = 4(00..100). Last set bit in d is at position 3 (from right side). 
 *So we need to return last two bits of n as they are and other bits as 0, i.e., 00..010.
 *
 */
public class Modulus_byPower_of_Two {
	public static void main(String[] args) {
		int dividend = 28;
		int divisor = 8;
		System.out.println("Modulus of " + dividend + " % " + divisor + " is : " + get_modulus(dividend, divisor));
		
		System.out.println(Integer.toBinaryString(-2 >> 31));
	}

	private static int get_modulus(int n, int d ) {
		return (n & (d - 1)) ;
	}
}
