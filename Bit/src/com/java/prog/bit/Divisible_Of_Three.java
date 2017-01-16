package com.java.prog.bit;
/**
 *Write an Efficient Method to Check if a Number is Multiple of 3
 *If difference between count of odd set bits (Bits set at odd positions) and even 
 *set bits is multiple of 3 then is the number.
 */
public class Divisible_Of_Three {
	public static void main(String[] args) {
		int n = 23;
		if(divisibleOf3(n) == 1)
			System.out.println("The number is divisible of three.");
		else
			System.out.println("The number is not divisible of three.");
	}

	public static int divisibleOf3(int n) {
		if(n < 0)
			n = -n;
		if(n == 0)
			return 1;
		if(n == 1)
			return 0;
		int odd_count = 0;
		int even_count = 0;
		while(n != 0){
			if((n & 1) == 1)
				odd_count++;
				n = n >> 1;
		
			if((n & 1) == 1)
				even_count++;
				n = n >> 1;
			
		}
		return divisibleOf3(Math.abs(odd_count - even_count));
	}
}
