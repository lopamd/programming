package com.java.prog.bit;
/**
 *Position of rightmost set bit
 *xor of number and its 2nd complementary will give the only rightmost bit having 1
 *log2 x= log(x)/ log(2)
 */
public class Pos_Rightmost_SetBit {
	public static void main(String[] args) {
		int n = 8;
		int pos = getFirstsetBit_position(n);
		System.out.println("The rightmost set bit in " + n + " is in the position: " + pos);
	}

	public static int getFirstsetBit_position(int i) {
		int position = (int)(Math.log(i & -i) / Math.log(2)) + 1;
		return position;
	}
	
}
