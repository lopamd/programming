package com.java.prog.bit;
/**
 *Efficient way to multiply with 7
 */
public class Multlply_with_7 {
	public static void main(String[] args) {
		int n = 50;
		int result = multiply_seven(n);
		System.out.println("The multiply of " + n + " with 7 is : " + result);
	}

	private static int multiply_seven(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 7;
		int n1 = n << 3;
		int res = n1 - n;
		return res;
	}
}
