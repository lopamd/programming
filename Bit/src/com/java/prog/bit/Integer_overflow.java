package com.java.prog.bit;
/**
 *2147483647 , -2147483648
 *Check for Integer Overflow
 */
public class Integer_overflow {
	public static void main(String[] args) {
		int result;
		int a = -9;
		int b = -2147483644;
		result = a+b;
		System.out.println(result);
		if(int_add_overflow(result, a, b) == -1)
			System.out.println("Integer overflow");
		else
			System.out.println("Not Integer Overflow");
	}

	public static int int_add_overflow(int result, int a, int b) {
		if((a > 0 && b > 0 && a > Integer.MAX_VALUE - b) || (a < 0 && b < 0 && a < Integer.MIN_VALUE - b))
			return -1;
		return 0;
	}
}
