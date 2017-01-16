package com.java.prog.bit;

/**
 *Next Power of 2
 */
public class Next_Power_of_Two {
	public static void main(String[] args) {
		int n = 16;
		System.out.println(nextPowerOf2(n));
		System.out.println(nextPowerOfTwo(n));
	}

	public static int nextPowerOf2(int n) {
		if((n > 0) && ((n & (n - 1)) == 0))
				return n;
		n--;
		n |= n >> 1;
		n |= n >> 2;
		n |= n >> 4;
		n |= n >> 8;
		n |= n >> 16;
		n++;
		return n;
	}
	public static int nextPowerOfTwo(int n){
		if((n > 0) && ((n & (n - 1)) == 0))
			return n;
		int count = 0;
		while(n != 0){
			n = n >> 1;
			count = count + 1;
			
		}
		return 1 << count;
	}
	
}
