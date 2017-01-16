package com.java.prog.bit;
/**
 *Compute the minimum or maximum of two integers without branching
 *Remember the formula
 */
public class Minimum_Maximum {
	public static void main(String[] args) {
		int x = 88899;
		int y = 9089898;
		int min = find_minimum(x, y);
		int max = find_maximum(x, y);
		System.out.println("The minimum of 2 numbers " + x + " and " + y + " is : " + min);
		System.out.println("The maximum of 2 numbers " + x + " and " + y + " is : " + max);
	}

	public static int find_minimum(int x, int y) {
		return 	y + ((x - y) & ((x - y) >> Integer.SIZE - 1));
		}
	
	public static int find_maximum(int x, int y) {
		return x - ((x - y) & ((x - y) >> Integer.SIZE - 1));
	}
}
