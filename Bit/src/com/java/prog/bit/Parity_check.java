package com.java.prog.bit;
/**MY SOLUTION
 *Write a C program to find the parity of an unsigned integer
 *Parity: Parity of a number refers to whether it contains an odd or even number of 1-bits. 
 *The number has “odd parity”, if it contains odd number of 1-bits and is “even parity” if it contains even number of 1-bits.
 */
public class Parity_check {
	public static void main(String[] args) {
		int n = 15;
		even_odd_parity(n);
	}

	public static void even_odd_parity(int n) {
		int parity = 0;
		if(n == 0){
			System.out.println("Invalid number zero,having no parity");
			return;
		}
		while(n != 0){
			
			if((n & 1) == 1)
				{ if(parity == 1)
					parity = 0;
				else
					parity = 1;
				}
			n = n >> 1;
			
		}
		if(parity == 0)
			System.out.println("Even parity");
		else
			System.out.println("Odd parity");
	}
}
